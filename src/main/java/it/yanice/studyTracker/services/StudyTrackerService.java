package it.yanice.studyTracker.services;

import it.yanice.studyTracker.db.CoursMemoryDb;
import it.yanice.studyTracker.db.Coursdb;
import it.yanice.studyTracker.domain.Cours;

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

    public void editCours(Cours cours){
        coursdb.delete(cours);
    }
}
