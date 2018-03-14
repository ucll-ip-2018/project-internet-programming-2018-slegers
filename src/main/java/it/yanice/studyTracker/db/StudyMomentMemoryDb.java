package it.yanice.studyTracker.db;

import it.yanice.studyTracker.domain.StudyMoment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudyMomentMemoryDb implements StudyMomentDb {

    private HashMap<Integer,StudyMoment> studyMomentMap;

    public StudyMomentMemoryDb(){
        studyMomentMap = new HashMap<>();
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
