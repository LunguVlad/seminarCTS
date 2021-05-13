package seminar11.ro.ase.cts.template.clase;

public abstract class SpectatorAbstract {
    public abstract void  asezareLaCoada();
    public abstract void prezentareBilet();
    public abstract void realizareControlCorporal();
    public abstract void ocupaLoc();

    public final void intrareInStadion(){
        asezareLaCoada();
        prezentareBilet();
        realizareControlCorporal();
        ocupaLoc();
    }

}
