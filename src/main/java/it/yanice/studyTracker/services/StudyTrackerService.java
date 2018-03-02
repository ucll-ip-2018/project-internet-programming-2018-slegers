package it.yanice.studyTracker.services;
import it.yanice.studyTracker.db.Coursedb;
import it.yanice.studyTracker.db.DbFactory;
import it.yanice.studyTracker.domain.Cours;

import java.util.Collection;

public class StudyTrackerService {
    private Coursedb coursedb;

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
    public Collection<Cours> getCourses(){
        return coursedb.getCourses();
    }
}
