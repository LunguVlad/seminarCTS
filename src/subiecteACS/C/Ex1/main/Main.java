package subiecteACS.C.Ex1.main;

import subiecteACS.C.Ex1.clase.Medicament;
import subiecteACS.C.Ex1.clase.MedicamentBody;
import subiecteACS.C.Ex1.clase.MedicamentFactory;
import subiecteACS.C.Ex1.clase.TipMedicament;

public class Main {
    public static void main(String[] args) {
        Medicament medicamentBody = new MedicamentFactory().getMedicament(TipMedicament.Body,"lmao",50.5f);
        System.out.println(medicamentBody);
    }
}
