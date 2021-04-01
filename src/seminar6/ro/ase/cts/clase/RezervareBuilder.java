package seminar6.ro.ase.cts.clase;

import java.security.PublicKey;

public class RezervareBuilder implements AbstractBuilder{

    private Rezervare rezervare;

    public RezervareBuilder(){
        this.rezervare = new Rezervare(0,false,false,false,false,"");
    }

    public RezervareBuilder(int codRezervare){
        this.rezervare = new Rezervare(codRezervare,false,false,false,false,"");
    }

    public RezervareBuilder setCodRezervare(int codRezervare){
        this.rezervare.setCodRezervare(codRezervare);

        return this;
    }

    public RezervareBuilder setAreMancare(boolean areMancare){
        rezervare.setAreMancare(areMancare);

        return this;
    }

    public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic){
        rezervare.setAreScaunErgonomic(areScaunErgonomic);

        return this;
    }

    public RezervareBuilder setAreBautura(boolean areBautura){
        rezervare.setAreBautura(areBautura);

        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica){
        rezervare.setGenMuzica(genMuzica);

        return this;
    }

    @Override
    public Rezervare build() {
        return this.rezervare;
    }
}
