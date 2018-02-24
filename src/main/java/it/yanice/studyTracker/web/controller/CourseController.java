package it.yanice.studyTracker.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "/Courses")
public class CourseController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getCourseOverview(){
        return new ModelAndView("courses","courses",new ArrayList<>());
    }

}
