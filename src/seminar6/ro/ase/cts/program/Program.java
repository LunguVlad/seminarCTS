package seminar6.ro.ase.cts.program;

import seminar6.ro.ase.cts.clase.Rezervare;
import seminar6.ro.ase.cts.clase.RezervareBuilder;
import seminar6.ro.ase.cts.clase.RezervareBuilderV2;

public class Program {
    public static void main(String[] args) {
        Rezervare rezervare1 = new RezervareBuilder().setCodRezervare(1).setAreBautura(true).setAreMancare(true).setAreScaunErgonomic(true).setGenMuzica("dfdwf").build();
        Rezervare rezervare2 = new RezervareBuilder(2).setAreBautura(true).setAreMancare(true).setAreScaunErgonomic(true).setGenMuzica("asdwq").build();

        System.out.println(rezervare1);
        System.out.println(rezervare2);

        RezervareBuilderV2 rezervareBuilderV2 = new RezervareBuilderV2().setAreMancare(true).setAreBautura(true).setAreScaunErgonomic(true);

        Rezervare rezervare3 = rezervareBuilderV2.setCodRezervare(3).build();
        Rezervare rezervare4 = rezervareBuilderV2.setCodRezervare(4).build();

        System.out.println(rezervare3);
        System.out.println(rezervare4);
    }
}
