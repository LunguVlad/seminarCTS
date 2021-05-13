package seminar11.ro.ase.cts.template.clase;

public class SpectatorVIP extends SpectatorAbstract{

    private String nume;

    public SpectatorVIP(String nume) {
        this.nume = nume;
    }

    @Override
    public void asezareLaCoada() {
        System.out.println("Spectatorul VIP " + this.nume + " s-a asezat la coada VIP");
    }

    @Override
    public void prezentareBilet() {
        System.out.println("Spectatorul  VIP" + this.nume + " a prezentat biletul");
    }

    @Override
    public void realizareControlCorporal() {
        System.out.println("Spectatorul VIP" + this.nume + " a fost controlat");
    }

    @Override
    public void ocupaLoc() {
        System.out.println("Spectatorul VIP" + this.nume + " a ocupat locul");
    }
}
