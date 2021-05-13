package seminar11.ro.ase.cts.observer.main;

import seminar11.ro.ase.cts.observer.clase.Client;
import seminar11.ro.ase.cts.observer.clase.Manager;
import seminar11.ro.ase.cts.observer.clase.Observator;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        Client client1 = new Client("Roberto");
        Client client2 = new Client("Andrei");
        Client client3 = new Client("Dima");

        manager.adaugaObservator(client1);
        manager.adaugaObservator(client2);
        manager.adaugaObservator(client3);

        manager.notificaObservatori("fotbal");

        manager.stergeObservator(client1);

        manager.notificaObservatori("handbal");
    }
}
