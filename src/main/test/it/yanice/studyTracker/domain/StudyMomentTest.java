package it.yanice.studyTracker.domain;

import org.junit.Before;
import org.junit.Test;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class StudyMomentTest {

    private StudyMoment studyMoment1, studyMoment1Copy;
    private StudyMoment studyMoment2;
    private Cours cn1, cn1copy;
    private Cours cn2;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate date;

    public StudyMomentTest() {
    }

    @Before
    public void setUp()  {
        date = LocalDate.of(1995,06,30);

        cn1 = new Cours("Computernetwerken 1",3,1);
        cn2 = new Cours("Computernetwerken 2",5,1);

        studyMoment1 = new StudyMoment(1,cn1,1,30,date);
        studyMoment2 = new StudyMoment(2,cn2,1,30,date);
        studyMoment1Copy = studyMoment1;
    }

    @Test(expected = IllegalArgumentException.class)
    public void studyMoment_negative_hours_Test(){
        StudyMoment t = new StudyMoment(1,cn1,-1,0,date);
    }
    @Test(expected = IllegalArgumentException.class)
    public void studyMoment_negative_minutes_Test(){
        StudyMoment t = new StudyMoment(1,cn1,1,-10,date);
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
        assertFalse(studyMoment1.equals(new StudyMoment(1,cn1,2,30,date)));
    }

    @Test
    public void studyMoment_equals_false_diff_minutes(){
        assertFalse(studyMoment1.equals(new StudyMoment(1,cn1,1,10,date)));
    }

    @Test
    public void studyMoment_equals_false_diff_date(){
        LocalDate date1 = LocalDate.of(1991,10,3);
        assertFalse(studyMoment1.equals(new StudyMoment(1,cn1,1,30,date1)));
    }

    @Test
    public void studyMoment_setHours_test(){
        assertTrue(studyMoment1.getHours() == 1);
    }

    @Test
    public void studyMoment_setMinutes_test(){
        assertTrue(studyMoment1.getMinutes() == 30);
    }

    @Test
    public void studyMoment_set_To_many_minutes_test(){
        StudyMoment s = new StudyMoment(1,cn1,1,120,date);
        assertTrue(s.getMinutes() == 0);
        assertTrue(s.getHours() == 3);
    }

    @Test (expected = IllegalArgumentException.class)
    public void setStudyMoment_cours_null(){
        StudyMoment s = new StudyMoment();
        s.setCours(null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void setStudyMoment_date_empty() {
        StudyMoment s = new StudyMoment();
        s.setDate(null);
    }


}
