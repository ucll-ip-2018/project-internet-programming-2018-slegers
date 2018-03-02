package it.yanice.studyTracker.db;

import it.yanice.studyTracker.domain.Cours;

import java.util.Collection;

public interface Coursdb {

     void insert(Cours cours);
     void delete(Cours cours);
     void edit(Cours cours);
     Cours getCours(String name);
     Collection<Cours> getCourses();
}
