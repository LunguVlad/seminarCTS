package seminar13.ro.ase.cts.test;

import org.junit.Test;
import seminar13.ro.ase.cts.clase.Grupa;

import static org.junit.Assert.*;

public class GrupaTest {

    @Test
    public void testConstructorCorect(){
        Grupa grupa = new Grupa(1081);
        assertEquals(1081,grupa.getNrGrupa());
    }

    @Test
    public void testConstructorExistanceList(){
        Grupa grupa = new Grupa(1081);
        assertNotNull(grupa.getStudenti());
    }

    @Test
    public void testConstructorLimitaInferioara(){
        Grupa grupa = new Grupa(1000);
        assertEquals(1000,grupa.getNrGrupa());
    }

    @Test
    public void testConstructorLimitaSuperioara(){
        Grupa grupa = new Grupa(1100);
        assertEquals(1100,grupa.getNrGrupa());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorErrorConditionInferioara(){
        Grupa grupa = new Grupa(900);

    }


    @Test(expected = IllegalArgumentException.class)
    public void testConstructorErrorConditionSuperioara(){
        Grupa grupa = new Grupa(1400);

    }

    @Test(timeout = 500)
    public void testConstructorPerformance(){
        Grupa grupa = new Grupa(1081);
    }


}