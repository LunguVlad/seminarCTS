package seminar5.ro.ase.cts.main;

import seminar5.ro.ase.cts.clase.Asistent;
import seminar5.ro.ase.cts.clase.FactoryPersonal;
import seminar5.ro.ase.cts.clase.PersonalSpital;
import seminar5.ro.ase.cts.clase.TipPersonal;

public class Program {
    public static void main(String[] args) {
        FactoryPersonal factoryPersonal = new FactoryPersonal();

        PersonalSpital asistent = factoryPersonal.createPersonal(TipPersonal.Asistent, "Robert");
        PersonalSpital medic = factoryPersonal.createPersonal(TipPersonal.Medic,"Andrei");

        System.out.println(asistent);
        System.out.println(medic);
    }
}
