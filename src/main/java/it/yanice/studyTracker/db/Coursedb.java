package it.yanice.studyTracker.db;

import it.yanice.studyTracker.domain.Cours;

import java.util.Collection;
import java.util.List;

public interface Coursedb {

     void insert(Cours cours);
     void delete(Cours cours);
     void edit(Cours cours);
     Cours getCours(String name);
     List<Cours> getCourses();
}
