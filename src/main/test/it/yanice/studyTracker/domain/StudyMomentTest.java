package it.yanice.studyTracker.domain;

import org.junit.Before;
import org.junit.Test;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.Assert.*;

public class StudyMomentTest {

    private StudyMoment studyMoment1, studyMoment1Copy;
    private StudyMoment studyMoment2;
    private Cours cn1, cn1copy;
    private Cours cn2;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate date;
    private LocalTime time;
    public StudyMomentTest() {
    }

    @Before
    public void setUp()  {
        date = LocalDate.of(1995,06,30);

        cn1 = new Cours(0,"netwerken",3,1);
        cn2 = new Cours(1,"testing",5,1);
        time = LocalTime.of(2,30);
        studyMoment1 = new StudyMoment(1,cn1,time,date);
        studyMoment2 = new StudyMoment(2,cn2,time,date);
        studyMoment1Copy = studyMoment1;
    }

    @Test
    public void studyMoment_equals_true_test(){
        assertTrue(studyMoment1.equals(studyMoment1Copy));
    }

    @Test
    public void studyMoment_equals_false_diff_cours_test(){
        assertFalse(studyMoment1.equals(studyMoment2));
    }

    @Test
    public void studyMoment_equals_false_diff_hours(){
        LocalTime time2 = LocalTime.of(3,30);
        assertFalse(studyMoment1.equals(new StudyMoment(1,cn1,time2,date)));
    }

    @Test
    public void studyMoment_equals_false_diff_minutes(){
        LocalTime time2 = LocalTime.of(3,30);

        assertFalse(studyMoment1.equals(new StudyMoment(1,cn1,time2,date)));
    }

    @Test
    public void studyMoment_equals_false_diff_date(){
        LocalDate date1 = LocalDate.of(1991,10,3);
        assertFalse(studyMoment1.equals(new StudyMoment(1,cn1,time,date1)));
    }

/*

    @Test (expected = IllegalArgumentException.class)
    public void setStudyMoment_cours_null(){
        StudyMoment s = new StudyMoment();
        s.setCours(null);
    }
    */

    @Test (expected = IllegalArgumentException.class)
    public void setStudyMoment_date_empty() {
        StudyMoment s = new StudyMoment();
        s.setDate(null);
    }


}
