package seminar11.ro.ase.cts.template.main;

import seminar11.ro.ase.cts.template.clase.Spectator;
import seminar11.ro.ase.cts.template.clase.SpectatorAbstract;
import seminar11.ro.ase.cts.template.clase.SpectatorVIP;

public class Main {
    public static void main(String[] args) {
        SpectatorAbstract spectator = new Spectator("Roberto");
        SpectatorAbstract spectatorVIP = new SpectatorVIP("Andrei");

        spectator.intrareInStadion();
        spectatorVIP.intrareInStadion();
    }
}
