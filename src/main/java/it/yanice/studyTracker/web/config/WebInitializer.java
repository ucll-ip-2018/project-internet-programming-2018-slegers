package it.yanice.studyTracker.web.config;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * A class that initializes the spring application front controller servlet.
 * It replaces the XML files
 * with java files.
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * Return all the classes that configure this application.
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ ApplicationConfig.class, WebSecurityConfig.class,ContextListner.class };
    }

    /**
     * This method returns the configuration of de dispatchservlet.
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ DispatcherServletConfig.class };
    }

    /**
     * Returns the requets that are allowed in the dispatchservlet.
     *
     * @return A regex that allows the request to use the dispatchServlet.
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"*.htm"};
    }
}
