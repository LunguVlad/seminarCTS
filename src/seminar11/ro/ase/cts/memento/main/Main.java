package seminar11.ro.ase.cts.memento.main;

import seminar11.ro.ase.cts.memento.clase.ManagerMemento;
import seminar11.ro.ase.cts.memento.clase.Meci;
import seminar11.ro.ase.cts.observer.clase.Manager;

public class Main {
    public static void main(String[] args) {
        Meci meci = new Meci("FCSB","CFR",50000,50000,500,500);
        ManagerMemento managerMemento = new ManagerMemento();
        managerMemento.adaugaMemento(meci.creeazaMemento());

        meci.setNrSpectatori(40000);

        managerMemento.adaugaMemento(meci.creeazaMemento());

        System.out.println(meci);
        meci.seteazaMemento(managerMemento.getMemento(0));

        System.out.println(meci);

        meci.seteazaMemento(managerMemento.getLastMemento());
        System.out.println(meci);
    }
}
