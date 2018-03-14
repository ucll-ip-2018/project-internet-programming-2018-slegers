package it.yanice.studyTracker.web.controller;

import it.yanice.studyTracker.domain.Cours;
import it.yanice.studyTracker.services.StudyTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/summary")
public class SummaryPage {

    public StudyTrackerService service;

    public SummaryPage(@Autowired StudyTrackerService service){
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getSummary(){
        System.out.println(service.getCourses().size());
        return new ModelAndView("summary","c",service.getCourses());
    }
}
