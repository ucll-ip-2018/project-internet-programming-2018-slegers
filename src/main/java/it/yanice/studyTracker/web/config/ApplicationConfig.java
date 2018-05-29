package it.yanice.studyTracker.web.config;

import it.yanice.studyTracker.services.StudyTrackerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    /**
     * Create a bean that is the service of this application.
     * @return
     */
    @Bean
    public StudyTrackerService service(){
        return new StudyTrackerService();
    }
}
