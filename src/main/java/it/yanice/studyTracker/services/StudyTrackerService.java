package it.yanice.studyTracker.services;
import it.yanice.studyTracker.db.CoursMemoryDb;
import it.yanice.studyTracker.db.CourseDb;
import it.yanice.studyTracker.db.DbFactory;
import it.yanice.studyTracker.db.StudyMomentDb;
import it.yanice.studyTracker.domain.Cours;
import it.yanice.studyTracker.domain.StudyMoment;

import java.util.List;

public class StudyTrackerService {
    private CourseDb coursedb;
    private StudyMomentDb studyMomentDb;

    public StudyTrackerService(){
        coursedb = new CoursMemoryDb();
       // coursedb = new DbFactory().getDB("CourseRelationalDb");
        //studyMomentDb = new DbFactory().getStudymomentDb("StudyMomentMemoryDb");
    }

    public void insertCours(Cours cours){
        coursedb.insert(cours);
    }

    public void deleteCours(int cours){
        coursedb.delete(cours);
    }

    public void updateCours(Cours cours){
        coursedb.edit(cours);
    }

    public Cours getCours(int id){
        return coursedb.getCours(id);
    }

    public List<Cours> getCourses(){
        return coursedb.getCourses();
    }

    public List<StudyMoment> getStudymoments() {
        return studyMomentDb.getStudyMoments();
    }

    public StudyMoment getStudyMoment(int studymomentId){
        return  studyMomentDb.getStudyMoment(studymomentId);
    }

    public void insertStudymoment(StudyMoment studyMoment){
        studyMomentDb.insert(studyMoment);
    }

    public void updateStudyMoment(StudyMoment moment){
        studyMomentDb.edit(moment);
    }
}
