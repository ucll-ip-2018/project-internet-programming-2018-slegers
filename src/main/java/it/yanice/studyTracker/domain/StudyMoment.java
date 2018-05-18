package it.yanice.studyTracker.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

public class StudyMoment {

    private int id;
   // private Cours cours;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate date;
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime time;

    public StudyMoment(){

    }

    public StudyMoment(int id, Cours cours, LocalTime time, LocalDate date){
        setId(id);
        //setCours(cours);
        setTime(time);
        setDate(date);
    }

    /*public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        if(cours == null){
            throw new IllegalArgumentException("The cours of a studymoment can't be null.");
        }
        this.cours = cours;
    }
    */

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        if(date == null){
            throw new IllegalArgumentException("The date of a studymoment can't be empty.");
        }
        this.date = date;
    }
/*
    @Override
    public boolean equals(Object o){
        if(o instanceof StudyMoment){
            StudyMoment s = (StudyMoment) o;
            if(getCours().equals(s.getCours()) && getTime().equals(s.getTime()) && getDate().equals(s.getDate())){
                return true;
            }
        }
        return false;
    }
*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTime(LocalTime time) {
        if(time == null){
            throw new IllegalArgumentException("The time of a studymoment can't be null.");
        }
        this.time = time;
    }

    public LocalTime getTime() {
        return time;
    }
}
