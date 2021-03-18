package seminar4.ro.ase.cts.clase;

//eager
public class Presedinte {

    private String nume;
    private int varsta;
    private int mandat;

    public Presedinte() {
        this.nume = "Putin";
        this.varsta = 68;
        this.mandat = 10;
    }

    public Presedinte(String nume, int varsta, int mandat) {
        this.nume = nume;
        this.varsta = varsta;
        this.mandat = mandat;
    }

    private static Presedinte instance = new Presedinte();

    public static Presedinte getInstance(){
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Presedinte{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", mandat=").append(mandat);
        sb.append('}');
        return sb.toString();
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setMandat(int mandat) {
        this.mandat = mandat;
    }
}
