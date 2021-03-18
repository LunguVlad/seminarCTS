package seminar4.ro.ase.cts.program;

import seminar4.ro.ase.cts.clase.Dovleac;
import seminar4.ro.ase.cts.clase.Presedinte;
import seminar4.ro.ase.cts.clase.PresedinteLazy;

public class Program {
    public static void main(String[] args) {
        Presedinte presedinte1 = Presedinte.getInstance();
        Presedinte presedinte2 = Presedinte.getInstance();

        presedinte1.setNume("Basescu");
        presedinte2.setMandat(2);

        System.out.println(presedinte1);
        System.out.println(presedinte2);

        PresedinteLazy presedinteLazy1 = PresedinteLazy.getInstance("Presedinte Lazy1",40,2);
        PresedinteLazy presedinteLazy2 = PresedinteLazy.getInstance("Presedinte Lazy2",50,1);

        System.out.println(presedinteLazy1);
        System.out.println(presedinteLazy2);

        //3 atrib de tiprui dif
        //singleton lazy thread safe

        Dovleac d1 = Dovleac.getInstance("Dovlecel",15.5,2.7F );
        Dovleac d2 = Dovleac.getInstance("Galben",17.5,2.2F );

        System.out.println(d1);
        System.out.println(d2);

    }
}
