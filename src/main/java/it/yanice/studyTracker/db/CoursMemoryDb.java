package it.yanice.studyTracker.db;

import it.yanice.studyTracker.domain.Cours;

import java.util.Collection;
import java.util.HashMap;

public class CoursMemoryDb implements Coursedb {

    private HashMap<String,Cours> courses;

    public CoursMemoryDb(){
        courses = new HashMap<>();
    }

    @Override
    public void insert(Cours cours) {
        courses.put(cours.getName(),cours);
    }

    @Override
    public void delete(Cours cours) {
        courses.remove(cours.getName());
    }

    @Override
    public void edit(Cours cours) {
        courses.put(cours.getName(),cours);
    }

    @Override
    public Cours getCours(String name) {
        return courses.get(name);
    }

    @Override
    public Collection<Cours> getCourses() {
        return courses.values();
    }
}
