package seminar6.ro.ase.cts.clase;

import ro.ase.cts.clase.Elev;

public class BiletAdapterClase extends Bilet implements IBiletOnline {


    public BiletAdapterClase(double pret) {
        super(pret);
    }

    @Override
    public void vindeBiletOnline() {
        super.vanzare();
    }

    @Override
    public void rezervaBiletOnline() {
        super.rezervare();
    }
}
