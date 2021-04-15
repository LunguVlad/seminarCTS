package seminar7.ro.ase.cts.facade.clase;

public class Persoana {
    private String nume;
    private String cnp;

    public Persoana(String nume, String cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public String getCnp() {
        return cnp;
    }

    public int getVarsta(){
        int an = 0;
        if(this.cnp.charAt(0)=='1'|| this.cnp.charAt(0)=='2')
            an=(1900 + Integer.parseInt("" + this.cnp.charAt(1) + this.cnp.charAt(2)));
        if(this.cnp.charAt(0)=='3'|| this.cnp.charAt(0)=='4')
            an=(1800 + Integer.parseInt("" + this.cnp.charAt(1) + this.cnp.charAt(2)));
        if(this.cnp.charAt(0)=='5'|| this.cnp.charAt(0)=='6')
            an=(2000 + Integer.parseInt("" + this.cnp.charAt(1) + this.cnp.charAt(2)));

        return 2021 - an;

    }
}
