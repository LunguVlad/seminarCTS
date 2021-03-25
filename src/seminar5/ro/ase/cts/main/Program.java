package seminar5.ro.ase.cts.main;

import seminar5.ro.ase.cts.clase.*;

import java.util.Optional;

public class Program {
    public static void afisareInformatiiSpital(IFactory factory, String nume){
        PersonalSpital personalSpital = factory.getPersonal(nume);
        System.out.println(personalSpital);
    }

    public static void main(String[] args) {
//        FactoryPersonal factoryPersonal = new FactoryPersonal();
//
//        PersonalSpital asistent = factoryPersonal.createPersonal(TipPersonal.Asistent, "Robert");
//        PersonalSpital medic = factoryPersonal.createPersonal(TipPersonal.Medic,"Andrei");
//
//        System.out.println(asistent);
//        System.out.println(medic);

        afisareInformatiiSpital(new FactoryAsistent(),"Mircea");
        afisareInformatiiSpital(new FactoryMedic(), "Alexandru");
    }
}
