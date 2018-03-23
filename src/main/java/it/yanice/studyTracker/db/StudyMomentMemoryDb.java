package it.yanice.studyTracker.db;

import it.yanice.studyTracker.domain.Cours;
import it.yanice.studyTracker.domain.StudyMoment;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudyMomentMemoryDb implements StudyMomentDb {

    private HashMap<Integer,StudyMoment> studyMomentMap;

    public StudyMomentMemoryDb(){
        studyMomentMap = new HashMap<>();
        LocalDate date = LocalDate.of(1995,06,30);
        Cours cn1 = new Cours("Computernetwerken 2",5,2);
        LocalTime time = LocalTime.of(2,30);
        insert(new StudyMoment(1,cn1,time,date));
        insert(new StudyMoment(2,cn1,time,date));
        insert(new StudyMoment(2,cn1,time,date));


    }

    @Override
    public void insert(StudyMoment moment) {
        studyMomentMap.put(moment.getId(),moment);
    }

    @Override
    public void delete(StudyMoment moment) {
        studyMomentMap.remove(moment);
    }

    @Override
    public void edit(StudyMoment moment) {
        insert(moment);
    }

    @Override
    public StudyMoment getStudyMoment(int id) {
        return studyMomentMap.get(id);
    }

    @Override
    public List<StudyMoment> getStudyMoments() {
        return new ArrayList<>(studyMomentMap.values());
    }
}
