package it.yanice.studyTracker.web.controller;

import it.yanice.studyTracker.services.StudyTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "/study_overview")
public class StudyOverviewPage {

    private StudyTrackerService service;
    public StudyOverviewPage(@Autowired StudyTrackerService service){
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getStudyOverview(){
        return new ModelAndView("study_overview","study_overview",new ArrayList<>());
    }
}
