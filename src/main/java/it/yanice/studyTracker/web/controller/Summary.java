package it.yanice.studyTracker.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "/summary")
public class Summary {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getSummary(){
        return new ModelAndView("summary","courses",new ArrayList<>());
    }
}
