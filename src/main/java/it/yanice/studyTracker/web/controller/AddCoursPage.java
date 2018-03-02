package it.yanice.studyTracker.web.controller;

import it.yanice.studyTracker.services.StudyTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping("/course_add")
public class AddCoursPage {

    private StudyTrackerService service;
    public AddCoursPage(@Autowired StudyTrackerService service){
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getCourseOverview(){
        return new ModelAndView("course_add","",null);
    }
}
