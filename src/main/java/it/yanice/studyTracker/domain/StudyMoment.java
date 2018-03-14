package it.yanice.studyTracker.domain;

public class StudyMoment {

    private Cours cours;
    private int hours;
    private int minutes;
    private String date;

    public StudyMoment(){

    }

    public StudyMoment(Cours cours, int hours,int minutes, String date){
        setCours(cours);
        setHours(hours);
        setMinutes(minutes);
        setDate(date);
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        if(cours == null){
            throw new IllegalArgumentException("The cours of a studymoment can't be null.");
        }
        this.cours = cours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours < 0){
            throw new IllegalArgumentException("The hours of a studymoment must be positive");
        }
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        if(date.trim().isEmpty()){
            throw new IllegalArgumentException("The date of a studymoment can't be empty.");
        }
        this.date = date;
    }

    public void setMinutes(int minutes) {
        if(minutes < 0){
            throw new IllegalArgumentException("The minitues of a studymoment must be positive.");
        }
        int hours = minutes /60;
        setHours(getHours() + hours);
        this.minutes = minutes % 60;
    }
}
