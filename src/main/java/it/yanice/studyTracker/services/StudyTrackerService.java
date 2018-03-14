package it.yanice.studyTracker.services;
import it.yanice.studyTracker.db.CourseDb;
import it.yanice.studyTracker.db.DbFactory;
import it.yanice.studyTracker.domain.Cours;

import java.util.List;

public class StudyTrackerService {
    private CourseDb coursedb;

    public StudyTrackerService(){
        coursedb = new DbFactory().getDB("CoursMemoryDb");
    }

    public void insertCours(Cours cours){
        coursedb.insert(cours);
    }
    public void deleteCours(Cours cours){
        coursedb.delete(cours);
    }

    public void UpdateCours(Cours cours){
        coursedb.delete(cours);
    }

    public Cours getCours(String coursname){
        return coursedb.getCours(coursname);
    }
    public List<Cours> getCourses(){
        return coursedb.getCourses();
    }
}
