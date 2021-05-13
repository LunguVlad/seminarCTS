package subiecteACS.C.Ex1.clase;

public class MedicamentFactory {
    public Medicament getMedicament(TipMedicament tipMedicament, String denumire, float pret){
        if(tipMedicament == TipMedicament.Body){
           return new MedicamentBody(denumire,pret);
        }
        if(tipMedicament == TipMedicament.Durere){
            return new MedicamentDurere(denumire,pret);
        }
        if(tipMedicament == TipMedicament.Raceala){
            return new MedicamentRaceala(denumire,pret);
        }
        return null;
    }
}
