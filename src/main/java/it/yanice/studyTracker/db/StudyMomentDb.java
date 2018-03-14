package it.yanice.studyTracker.db;
import it.yanice.studyTracker.domain.StudyMoment;

import java.util.List;

public interface StudyMomentDb {
    void insert(StudyMoment moment);
    void delete(StudyMoment moment);
    void edit(StudyMoment moment);
    StudyMoment getStudyMoment(int id);
    List<StudyMoment> getStudyMoments();
}
