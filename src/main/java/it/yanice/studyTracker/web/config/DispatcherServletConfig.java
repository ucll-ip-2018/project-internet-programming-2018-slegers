package it.yanice.studyTracker.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * @Configuration: Tell spring it's a configuration class
 * @EnableWebMvc: Enable the default MVC class
 * @ComponentScan("it.yanice.studyTracker.web.controller")
 * Tells spring where to find the controllers.
 */
@Configuration
@EnableWebMvc
@ComponentScan("it.yanice.studyTracker.web.controller")
public class DispatcherServletConfig implements WebMvcConfigurer{
    /**
     * Maps the root path to the index file.
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("index.htm").setViewName("index");
    }

    /**
     * Tells spring where to find the jsp files of this application.
     *
     * Beans are objects that are automaticly are initiated with the metadata that the users
     * provide.
     *
     * @return
     */
    @Bean
    public InternalResourceViewResolver getViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
