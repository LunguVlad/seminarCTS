package seminar9.ro.ase.cts.flyweight.clase;

public class Rezervare {
    private int nrMasa;
    private int nrPersoane;
    private int ora;

    public Rezervare(int nrMasa, int nrPersoane, int ora) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.ora = ora;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrMasa=").append(nrMasa);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", ora=").append(ora);
        sb.append('}');
        return sb.toString();
    }
}
