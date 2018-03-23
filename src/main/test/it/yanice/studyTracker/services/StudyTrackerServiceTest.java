package it.yanice.studyTracker.services;

import it.yanice.studyTracker.domain.Cours;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertTrue;

public class StudyTrackerServiceTest {

    private StudyTrackerService studyTrackerService;
    private Cours CN2;
    private Cours CN1;

    @Before
    public void init(){
        CN2 = new Cours(0,"netwerken",5,2);
        CN1 = new Cours(1,"testing",3,1);
        studyTrackerService = new StudyTrackerService();
    }

    @Test
    public void testInsertCours() throws Exception {
        studyTrackerService.insertCours(CN2);
        assertTrue(studyTrackerService.getCourses().size() == 1);
        studyTrackerService.insertCours(CN1);
        assertTrue(studyTrackerService.getCourses().size() ==2);
    }

    @Test
    public void testDeleteCours() throws Exception {
        studyTrackerService.deleteCours(CN2.getId());
        assertTrue(studyTrackerService.getCourses().size() ==0);
    }
    @Test
    public void deleteCoursIfAlreadyInThere(){
       studyTrackerService.insertCours(CN2);
        assertTrue(studyTrackerService.getCourses().size()==1);
        studyTrackerService.deleteCours(CN2.getId());
        assertTrue(studyTrackerService.getCourses().size() == 0);
    }

}