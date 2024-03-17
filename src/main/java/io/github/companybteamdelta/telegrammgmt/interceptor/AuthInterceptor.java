package io.github.companybteamdelta.telegrammgmt.interceptor;

import io.github.companybteamdelta.telegrammgmt.repositories.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class AuthInterceptor implements HandlerInterceptor {

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String apiKey = request.getHeader("Authorization");

        if (apiKey == null || !userRepository.existsByApiKey(apiKey)) {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED,
                    "Unauthorized: API key is missing or invalid");
            return false;
        }

        return true;
    }
}
