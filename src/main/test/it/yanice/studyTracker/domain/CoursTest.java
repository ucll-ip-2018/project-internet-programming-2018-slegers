package it.yanice.studyTracker.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoursTest {

    private Cours cn2, cn2Copy;
    private Cours cn1;

    @Before
    public void init(){
        cn1 = new Cours(0,"netwerken",5,2);
        cn2 = new Cours(1,"testing",3,1);
        cn2Copy = cn2;
    }

    @Test
    public void setName() throws Exception {
        cn1.setName("CN1");
        assertEquals("CN1",cn1.getName());
    }

    @Test
    public void setStudyPoints() throws Exception {
        cn1.setStudyPoints(3);
        assertEquals(3,cn1.getStudyPoints());
    }

    @Test
    public void setSemester() throws Exception {
        cn1.setSemester(1);
        assertEquals(1,cn1.getSemester());
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeStudyPoints(){
        cn1.setSemester(-3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void zeroAsStudyPoints(){
        cn1.setSemester(0);
    }

    @Test
    public void equals_true_test(){
        assertTrue(cn2.equals(cn2Copy));
    }

    @Test
    public void equals_false_test(){
        assertFalse(cn1.equals(cn2));
    }
}
