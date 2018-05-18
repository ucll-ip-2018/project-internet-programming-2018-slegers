package it.yanice.studyTracker.db;

import it.yanice.studyTracker.domain.Cours;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CoursMemoryDb implements CourseDb {

    private HashMap<Integer,Cours> courses;

    public CoursMemoryDb(){
        courses = new HashMap<>();
        insert(new Cours(2,"ComputerNetwerken",5,2));
        insert(new Cours(1,"Testing",3,1));
    }

    @Override
    public void insert(Cours cours) {
        if(cours.getId() == 0 ){
            cours.setId(courses.size()+1);
            courses.put(courses.size()+1,cours);
        }else{
            edit(cours);
        }
    }

    @Override
    public void delete(int cours) {
        courses.remove(cours);
    }

    @Override
    public void edit(Cours cours) {
        courses.put(cours.getId(),cours);
    }

    @Override
    public Cours getCours(int id) {
        return courses.get(id);
    }

    @Override
    public List<Cours> getCourses() {
        return new ArrayList<>(courses.values());
    }
}
