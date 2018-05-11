package it.yanice.studyTracker.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

@Configuration
@EnableWebSecurity
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

}
