package it.yanice.studyTracker.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.ws.rs.GET;

@Controller
@RequestMapping("/study_add")
public class AddStudy {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getAddStudy(){
        return new ModelAndView("study_add","study_add",null);
    }
}
