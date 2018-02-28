package it.yanice.studyTracker.domain;

public class Cours {
    private String name;
    private int studyPoints;
    private int semester;

    public Cours(String name, int StudyPoints, int semester){
        setName(name);
        setStudyPoints(studyPoints);
        setSemester(semester);
    }

    public void setName(String name) {
        if(name.trim().isEmpty()){
            throw new IllegalArgumentException("The name of a cours can't be empty.");
        }
        this.name = name;
    }

    public void setStudyPoints(int studyPoints) {
        if(studyPoints <=0 ){
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
}
