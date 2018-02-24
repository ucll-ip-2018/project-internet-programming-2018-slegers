package it.yanice.studyTracker.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "/study_overview")
public class StudyOverview {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getStudyOverview(){
        return new ModelAndView("study_overview","study_overview",new ArrayList<>());
    }
}
