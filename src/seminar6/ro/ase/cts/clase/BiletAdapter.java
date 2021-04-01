package seminar6.ro.ase.cts.clase;

public class BiletAdapter implements IBiletOnline{

    private Bilet bilet;

    public BiletAdapter(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void vindeBiletOnline() {
        bilet.vanzare();
    }

    @Override
    public void rezervaBiletOnline() {
        bilet.rezervare();
    }
}
