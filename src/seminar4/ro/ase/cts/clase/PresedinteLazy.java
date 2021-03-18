package seminar4.ro.ase.cts.clase;

public class PresedinteLazy {
    private String nume;
    private int varsta;
    private int mandat;

    private static PresedinteLazy instance = null;

    public PresedinteLazy() {
        this.nume = "Putin";
        this.varsta = 68;
        this.mandat = 10;
    }

    public PresedinteLazy(String nume, int varsta, int mandat) {
        this.nume = nume;
        this.varsta = varsta;
        this.mandat = mandat;
    }

    public static synchronized PresedinteLazy getInstance(String nume,int varsta,int mandat){
        if(instance == null){
            instance = new PresedinteLazy(nume,varsta,mandat);
        }

        return instance;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PresedinteLazy{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", mandat=").append(mandat);
        sb.append('}');
        return sb.toString();
    }
}
