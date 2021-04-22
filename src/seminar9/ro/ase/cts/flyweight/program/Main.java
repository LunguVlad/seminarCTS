package seminar9.ro.ase.cts.flyweight.program;

import seminar9.ro.ase.cts.flyweight.clase.Client;
import seminar9.ro.ase.cts.flyweight.clase.Flyweight;
import seminar9.ro.ase.cts.flyweight.clase.FlyweightFactory;
import seminar9.ro.ase.cts.flyweight.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(1,2,20);
        Rezervare rezervare2 = new Rezervare(2,4,22);
        Rezervare rezervare3 = new Rezervare(3,5,17);
        Rezervare rezervare4 = new Rezervare(4,7,15);

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight client = flyweightFactory.getFlyWeight("0722442244");

        client.printeazaRezervare(rezervare1);

        flyweightFactory.getFlyWeight("0722442245").printeazaRezervare(rezervare2);
        flyweightFactory.getFlyWeight("0722442244").printeazaRezervare(rezervare3);
        flyweightFactory.getFlyWeight("0722442245").printeazaRezervare(rezervare4);
    }
}
