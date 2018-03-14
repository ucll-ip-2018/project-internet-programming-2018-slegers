package it.yanice.studyTracker.web.controller;

import it.yanice.studyTracker.services.StudyTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/summary")
public class
SummaryPage {

    public StudyTrackerService service;

    public SummaryPage(@Autowired StudyTrackerService service){
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getSummary(){
        ModelAndView mav = new ModelAndView("summary","courses",service.getCourses());
        mav.addObject("moments",service.getStudymoments());
        return mav;
    }
}
