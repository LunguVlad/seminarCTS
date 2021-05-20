package seminar12.ro.ase.cts.tests;

import org.junit.Test;
import seminar12.ro.ase.cts.clase.Student;

import static org.junit.Assert.*;

public class StudentTests {

    @Test
    public void testConstructorCuParametru(){
        String nume = "Gigel";
        Student student = new Student(nume);

        assertEquals(nume,student.getNume());
        assertNotNull(student.getNote());
    }

    @Test
    public void testConstructorFaraParametrii(){
        Student student = new Student();

        assertNotNull("Atributul note nu a fost initializat",student.getNote());
        assertNotNull("Atributul nume nu  a fost initializat",student.getNume());
    }

    @Test
    public void testAdaugaNota(){
        Student student = new Student();

        int nota = 5;
        student.adaugaNota(nota);
        assertEquals(nota,student.getNota(0));
    }

    @Test
    public void testAdaugaNotaDimensiune(){
        Student student = new Student();
        student.adaugaNota(5);
        student.adaugaNota(8);
        assertEquals(2,student.getNote().size());
    }

    @Test
    public void testCalculeazaMedieNote(){
        Student student = new Student();
        student.adaugaNota(5);
        student.adaugaNota(8);

        assertEquals(6.5f,student.calculeazaMedie(),0.1);
    }

    @Test
    public void testCalculeazaMedieFaraNote(){
        Student student = new Student();

        assertEquals(0, student.calculeazaMedie(),0.1);
    }

    @Test
    public void testCalculeazaMedieCuONota(){
        Student student = new Student();

        student.adaugaNota(5);

        assertEquals(5, student.calculeazaMedie(),0.1);
    }

    @Test
    public void testAreRestante(){
        Student student = new Student();

        student.adaugaNota(9);
        student.adaugaNota(3);

        assertTrue(student.areRestante());
    }

    @Test
    public void testNuAreRestante(){
        Student student = new Student();

        student.adaugaNota(9);
        student.adaugaNota(8);

        assertFalse(student.areRestante());
    }

    @Test
    public void testGetNotaExceptie(){
        Student student = new Student();
        student.adaugaNota(5);
        student.adaugaNota(7);

        //1
        try{
            //2
            student.getNota(5);
            //3

        }catch (IndexOutOfBoundsException indexOutOfBoundsException){
            //4
        }catch (Exception exception){
            fail("Metoda arunca o alta exceptie");
        }
        //5
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNotaExceptieV4(){
        Student student = new Student();
        student.adaugaNota(5);
        student.adaugaNota(7);

        student.getNota(5);
    }

//    @Test
//    public void testGetNotaExceptieV5(){
//        Student student = new Student();
//        student.adaugaNota(5);
//        student.adaugaNota(7);
//
//        assertThrows(IndexOutOfBoundsException.class, () -> {
//            student.getNota(5);
//        });
//
//    }

}