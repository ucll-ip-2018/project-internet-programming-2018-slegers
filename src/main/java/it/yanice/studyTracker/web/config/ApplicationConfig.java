package it.yanice.studyTracker.web.config;

import it.yanice.studyTracker.services.StudyTrackerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    public StudyTrackerService service(){
        return new StudyTrackerService();
    }
}
