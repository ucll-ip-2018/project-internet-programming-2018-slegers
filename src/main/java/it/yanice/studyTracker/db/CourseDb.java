package it.yanice.studyTracker.db;

import it.yanice.studyTracker.domain.Cours;

import java.util.List;

public interface CourseDb {

     void insert(Cours cours);
     void delete(int cours);
     void edit(Cours cours);
     Cours getCours(int name);
     List<Cours> getCourses();
}
