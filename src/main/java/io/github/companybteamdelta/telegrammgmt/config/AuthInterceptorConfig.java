package io.github.companybteamdelta.telegrammgmt.config;

import io.github.companybteamdelta.telegrammgmt.interceptor.AuthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import io.github.companybteamdelta.telegrammgmt.repositories.UserRepository;

@Configuration
public class AuthInterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthInterceptor(userRepository));
    }
}
