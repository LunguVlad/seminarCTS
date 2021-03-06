package seminar13.ro.ase.cts.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import seminar13.ro.ase.cts.clase.Grupa;
import seminar13.ro.ase.cts.clase.IStudent;
import seminar13.ro.ase.cts.clase.Student;
import seminar13.ro.ase.cts.test.categorii.GetPromovabilitateCategory;
import seminar13.ro.ase.cts.test.categorii.TesteUrgenteCategory;

import static org.junit.Assert.*;

public class GrupaTestFixture {

    private Grupa grupa;
    
    @Before
    public void setup(){
        grupa = new Grupa(1070);
        for(int i=0;i<20;++i){
            IStudent student = new Student();
            student.adaugaNota(5);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }
        for(int i=0;i<15;++i){
            IStudent student = new Student();
            student.adaugaNota(4);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);

        }
    }

    @Test(timeout = 500)
    @Category({GetPromovabilitateCategory.class, TesteUrgenteCategory.class})
    public void testGetPromovabilitatePerformance(){
        grupa.getPromovabilitate();
    }

}