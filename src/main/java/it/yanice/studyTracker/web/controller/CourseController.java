package it.yanice.studyTracker.web.controller;

import it.yanice.studyTracker.domain.Cours;
import it.yanice.studyTracker.services.StudyTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/Courses")
public class CourseController {

    private StudyTrackerService service;

    public CourseController(@Autowired StudyTrackerService service){
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getCourseOverview(){
        return new ModelAndView("courses","courses", service.getCourses());
    }


    @RequestMapping(value= "/add", method = RequestMethod.GET)
    public ModelAndView getAddCoursForm(){
        return new ModelAndView("cours_add","",null);
    }

    @RequestMapping(method = RequestMethod.POST)
    public String save(Cours c, BindingResult result){
        if(result.hasErrors()){
            return "coursForm";
        }else{
            service.insertCours(c);
            return "redirect:/Courses.htm";
        }
    }
}

