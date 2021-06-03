package seminar13.ro.ase.cts.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import seminar13.ro.ase.cts.clase.Grupa;
import seminar13.ro.ase.cts.clase.IStudent;
import seminar13.ro.ase.cts.clase.Student;
import seminar13.ro.ase.cts.test.categorii.ConstructorGrupaCategory;
import seminar13.ro.ase.cts.test.categorii.GetPromovabilitateCategory;
import seminar13.ro.ase.cts.test.categorii.TesteUrgenteCategory;

import static org.junit.Assert.*;

public class GrupaTest {

    private Grupa grupa;

    @Test
    @Category(ConstructorGrupaCategory.class)
    public void testConstructorCorect(){
        Grupa grupa = new Grupa(1081);
        assertEquals(1081,grupa.getNrGrupa());
    }

    @Test
    @Category(ConstructorGrupaCategory.class)
    public void testConstructorExistanceList(){
        Grupa grupa = new Grupa(1081);
        assertNotNull(grupa.getStudenti());
    }

    @Test
    @Category(ConstructorGrupaCategory.class)
    public void testConstructorLimitaInferioara(){
        Grupa grupa = new Grupa(1000);
        assertEquals(1000,grupa.getNrGrupa());
    }

    @Test
    @Category(ConstructorGrupaCategory.class)
    public void testConstructorLimitaSuperioara(){
        Grupa grupa = new Grupa(1100);
        assertEquals(1100,grupa.getNrGrupa());
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(ConstructorGrupaCategory.class)
    public void testConstructorErrorConditionInferioara(){
        Grupa grupa = new Grupa(900);

    }


    @Test(expected = IllegalArgumentException.class)
    @Category(ConstructorGrupaCategory.class)
    public void testConstructorErrorConditionSuperioara(){
        Grupa grupa = new Grupa(1400);

    }

    @Test(timeout = 500)
    @Category(ConstructorGrupaCategory.class)
    public void testConstructorPerformance(){
        Grupa grupa = new Grupa(1081);
    }

    @Test
    @Category(GetPromovabilitateCategory.class)
    public void testGetPromovabilitateRight(){
        Grupa grupa = new Grupa(1081);
        for(int i=0;i<10;++i){
            IStudent student = new Student();
            student.adaugaNota(5);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }
        for(int i=0;i<5;++i){
            IStudent student = new Student();
            student.adaugaNota(4);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }

        assertEquals(0.66f,grupa.getPromovabilitate(),0.1);
    }

    @Test
    @Category(GetPromovabilitateCategory.class)
    public void testGetPromovabilitateLimitaInferioara(){
        Grupa grupa = new Grupa(1001);
        for(int i=0;i<5;++i){
            IStudent student = new Student();
            student.adaugaNota(4);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }

        assertEquals(0,grupa.getPromovabilitate(),0.01);
    }

    @Test
    @Category({GetPromovabilitateCategory.class, TesteUrgenteCategory.class})
    public void testGetPromovabilitateLimitaSuperioara(){
        Grupa grupa = new Grupa(1081);
        for(int i=0;i<10;++i){
            IStudent student = new Student();
            student.adaugaNota(5);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }

        assertEquals(1,grupa.getPromovabilitate(),0.01);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    @Category(GetPromovabilitateCategory.class)
    public void testGetPromovabilitateErrorCondition(){
        Grupa grupa = new Grupa(1050);

        grupa.getPromovabilitate();
    }


    @Test
    @Category(GetPromovabilitateCategory.class)
    public void testGetPromovabilitateCardinality(){
        Grupa grupa = new Grupa(1081);
        IStudent student = new Student();
        student.adaugaNota(5);
        student.adaugaNota(7);
        grupa.adaugaStudent(student);
        assertEquals(1,grupa.getPromovabilitate(),0.01);
    }

}