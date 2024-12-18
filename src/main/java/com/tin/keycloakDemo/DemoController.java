package com.tin.keycloakDemo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @GetMapping("/hello")
    @PreAuthorize("hasRole('client-user')")
    public String hello() {
        return "Hello from Spring Boot and KeyCloak";
    }

    @GetMapping("/hello-2")
    @PreAuthorize("hasRole('client-admin')")
    public String hello2() {
        return "Hello from Spring Boot and KeyCloak - ADMIN";
    }
}
