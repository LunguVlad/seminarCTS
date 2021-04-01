package seminar6.ro.ase.cts.clase;

public class RezervareBuilderV2 implements AbstractBuilder{
    private int codRezervare;
    private boolean areMancare;
    private boolean areScaunErgonomic;
    private boolean areBautura;
    private boolean areMuzicaAmbientala;
    private String genMuzica;

    public RezervareBuilderV2() {
    }

    public RezervareBuilderV2 setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;

        return this;
    }

    public RezervareBuilderV2 setAreMancare(boolean areMancare) {
        this.areMancare = areMancare;

        return this;
    }

    public RezervareBuilderV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;

        return this;
    }

    public RezervareBuilderV2 setAreBautura(boolean areBautura) {
        this.areBautura = areBautura;

        return this;
    }

    public RezervareBuilderV2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;

        return this;
    }

    public RezervareBuilderV2 setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;

        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(codRezervare,areMancare,areScaunErgonomic,areBautura,areMuzicaAmbientala,genMuzica);
    }
}
