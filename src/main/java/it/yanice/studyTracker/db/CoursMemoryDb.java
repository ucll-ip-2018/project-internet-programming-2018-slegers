package it.yanice.studyTracker.db;

import it.yanice.studyTracker.domain.Cours;

import java.util.HashMap;

public class CoursMemoryDb implements Coursdb {

    private HashMap<String,Cours> courses;

    @Override
    public void insert(Cours cours) {
        courses.put(cours.getName(),cours);
    }

    @Override
    public void delete(Cours cours) {
        courses.remove(cours);
    }

    @Override
    public void edit(Cours cours) {
        courses.put(cours.getName(),cours);
    }
}
