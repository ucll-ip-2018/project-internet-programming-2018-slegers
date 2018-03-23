package it.yanice.studyTracker.web.controller;

import it.yanice.studyTracker.domain.StudyMoment;
import it.yanice.studyTracker.services.StudyTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/Studymoment")
public class StudyController {
    private StudyTrackerService service;

    public StudyController(@Autowired StudyTrackerService service){
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getStudyOverview(){
        return new ModelAndView("study_overview","moments",service.getStudymoments());
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public ModelAndView getAddStudymomentForm(){
        return new ModelAndView("study_add","courses",service.getCourses());
    }

    @RequestMapping(method = RequestMethod.POST)
    public String save(StudyMoment m, BindingResult r){
        if(r.hasErrors()){
            return "study_add";
        }
        service.insertStudymoment(m);
        return "redirect:/Studymoment.htm";
    }
}
