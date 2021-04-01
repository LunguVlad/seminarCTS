package seminar6.ro.ase.cts.program;

import seminar6.ro.ase.cts.clase.Bilet;
import seminar6.ro.ase.cts.clase.BiletAdapter;
import seminar6.ro.ase.cts.clase.BiletAdapterClase;
import seminar6.ro.ase.cts.clase.IBiletOnline;

public class ProgramAdapter {

    private static void rezervaSiAfiseazaBiletLaCasa(Bilet bilet){
        bilet.rezervare();
        bilet.vanzare();
    }

    private static void rezervaSiAfiseazaBiletOnline(IBiletOnline biletOnline){
        biletOnline.rezervaBiletOnline();
        biletOnline.vindeBiletOnline();
    }

    public static void main(String[] args) {
        Bilet bilet = new Bilet(20);
        rezervaSiAfiseazaBiletLaCasa(bilet);

        IBiletOnline biletOnline = new BiletAdapter(bilet);

        rezervaSiAfiseazaBiletOnline(biletOnline);

        IBiletOnline adapterClase = new BiletAdapterClase(50);
        rezervaSiAfiseazaBiletOnline(adapterClase);

    }
}
