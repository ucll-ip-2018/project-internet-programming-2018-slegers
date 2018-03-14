package it.yanice.studyTracker.web.controller;

import it.yanice.studyTracker.services.StudyTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.ws.rs.GET;

@Controller
@RequestMapping("/study_add")
public class AddStudyPage {

    private StudyTrackerService service;

    public AddStudyPage(@Autowired StudyTrackerService service){
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getAddStudy(){
        return new ModelAndView("study_add","courses",service.getCourses());
    }
}
