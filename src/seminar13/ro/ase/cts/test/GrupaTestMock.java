package seminar13.ro.ase.cts.test;

import org.junit.Test;
import seminar13.ro.ase.cts.clase.Grupa;
import seminar13.ro.ase.cts.clase.IStudent;
import seminar13.ro.ase.cts.test.mockuri.DummyStudent;
import seminar13.ro.ase.cts.test.mockuri.FakeStudent;
import seminar13.ro.ase.cts.test.mockuri.StubStudent;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GrupaTestMock {

    @Test
    public void testAdaugaStudent(){
        IStudent student = new DummyStudent();
        Grupa grupa = new Grupa(1081);

        grupa.adaugaStudent(student);

        assertEquals(1,grupa.getStudenti().size());
    }

    @Test
    public void testGetPromovabilitate(){
        IStudent student = new StubStudent();
        Grupa grupa = new Grupa(1081);

        grupa.adaugaStudent(student);

        assertEquals(1,grupa.getPromovabilitate(),0.01);
    }

    @Test
    public void testGetPromovabilitateRight(){
        Grupa grupa = new Grupa(1081);
        for(int i=0;i<8;++i){
            FakeStudent fakeStudent = new FakeStudent();
            fakeStudent.setAreRestante(false);
            grupa.adaugaStudent(fakeStudent);
        }

        for(int i=0;i<2;++i){
            FakeStudent fakeStudent = new FakeStudent();
            fakeStudent.setAreRestante(true);
            grupa.adaugaStudent(fakeStudent);
        }

        assertEquals(0.8f,grupa.getPromovabilitate(),0.01);
    }

}