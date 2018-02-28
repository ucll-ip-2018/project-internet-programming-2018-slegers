package it.yanice.studyTracker.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping("/course_add")
public class AddCours {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getCourseOverview(){
        return new ModelAndView("course_add","couse_add",null);
    }
}
