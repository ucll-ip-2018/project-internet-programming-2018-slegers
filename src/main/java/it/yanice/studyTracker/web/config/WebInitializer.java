package it.yanice.studyTracker.web.config;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Nullable
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ ApplicationConfig.class, WebSecurityConfig.class,ContextListner.class };
    }
    @Nullable
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ DispatcherServletConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"*.htm"};
    }
}
