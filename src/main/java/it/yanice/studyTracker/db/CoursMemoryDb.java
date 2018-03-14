package it.yanice.studyTracker.db;

import it.yanice.studyTracker.domain.Cours;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CoursMemoryDb implements CourseDb {

    private HashMap<String,Cours> courses;

    public CoursMemoryDb(){
        courses = new HashMap<>();
        insert(new Cours("CN 2",5,2));
        insert(new Cours("CN 1",3,1));
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
    public List<Cours> getCourses() {
        return new ArrayList<>(courses.values());
    }
}
