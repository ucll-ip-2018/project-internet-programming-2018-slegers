package it.yanice.studyTracker.db;

import it.yanice.studyTracker.domain.Cours;

public interface Coursdb {

     void insert(Cours cours);
     void delete(Cours cours);
     void edit(Cours cours);

}
