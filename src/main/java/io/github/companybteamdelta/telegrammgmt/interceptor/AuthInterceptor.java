package io.github.companybteamdelta.telegrammgmt.interceptor;

import io.github.companybteamdelta.telegrammgmt.repositories.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class AuthInterceptor implements HandlerInterceptor {

    private final UserRepository userRepository;

    public AuthInterceptor(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String authHeader = request.getHeader("Authorization");
        String apiKey = authHeader != null ? authHeader.split(" ")[1] : null;

        if (apiKey == null || !userRepository.existsByApiKey(apiKey)) {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED,
                    "Unauthorized: API key is missing or invalid");
            return false;
        }

        return true;
    }
}
