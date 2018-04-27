package it.yanice.studyTracker.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cours {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int studyPoints;
    private int semester;

    public Cours(){

    }

    public Cours(int id, String name, int studyPoints, int semester){
        setId(id);
        setName(name);
        setStudyPoints(studyPoints);
        setSemester(semester);
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("The name of a cours can't be empty.");
        }
        this.name = name;
    }

    public void setStudyPoints(int studyPoints) {
        if(studyPoints <= 0 ){
            throw new IllegalArgumentException("The studypoints should be strict positive.");
        }
        this.studyPoints = studyPoints;
    }

    public void setSemester(int semester) {
        if(semester < 1 || semester > 3){
            throw new IllegalArgumentException("The semester of a cours should be 1, 2, 3.");
        }
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public int getStudyPoints(){
        return studyPoints;
    }

    public int getSemester(){
        return semester;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Cours){
            Cours c = (Cours) o;
            if(this.getName().equals(c.getName()) && this.getSemester() == c.getSemester() && this.getStudyPoints() == c.getStudyPoints()){
                return true;
            }
        }
        return false;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return id;
    }
}
