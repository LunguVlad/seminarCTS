package seminar4.ro.ase.cts.program;

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
    }
}
