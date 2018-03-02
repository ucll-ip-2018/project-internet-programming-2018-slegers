package it.yanice.studyTracker.services;

import it.yanice.studyTracker.db.CoursMemoryDb;
import it.yanice.studyTracker.db.Coursdb;
import it.yanice.studyTracker.domain.Cours;

import java.util.Collection;

public class StudyTrackerService {
    private Coursdb coursdb;

    public StudyTrackerService(){
        coursdb = new CoursMemoryDb();
    }

    public void insertCours(Cours cours){
        coursdb.insert(cours);
    }
    public void deleteCours(Cours cours){
        coursdb.delete(cours);
    }

    public void UpdateCours(Cours cours){
        coursdb.delete(cours);
    }

    public Cours getCours(String coursname){
        return coursdb.getCours(coursname);
    }
    public Collection<Cours> getCourses(){
        return coursdb.getCourses();
    }
}
