package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;
import ro.ase.cts.clase.Student;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class IReader {
    protected String filePath;

    public IReader(String filePath) {
        this.filePath = filePath;
    }

    public abstract List<Aplicant> readAplicants() throws FileNotFoundException;

    public Aplicant citireAplicant (Scanner input, Aplicant aplicant){
        String nume = input.next();
        String prenume = input.next();
        int varsta = input.nextInt();
        int punctaj = input.nextInt();
        int nr = input.nextInt();
        String[] vect = new String[nr];
        for (int i = 0; i < nr; i++)
            vect[i] = input.next();

        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setVectorDenumiriProiecte(vect,nr);

        return aplicant;

//        if(aplicant instanceof Angajat){
//            int salariu = input.nextInt();
//            String ocupatie = input.next();
//
//            ((Angajat) aplicant).setSalariu(salariu);
//            ((Angajat) aplicant).setOcupatie(ocupatie);
//
//        }if(aplicant instanceof Elev){
//
//        }if(aplicant instanceof Student){
//
//        }

        //return null;

    }

}
