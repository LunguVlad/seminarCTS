package seminar5.ro.ase.cts.clase;

public class Asistent extends PersonalSpital{
    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Assistent{");
        sb.append("nume: ");
        sb.append(super.getNume());
        sb.append('}');
        return sb.toString();
    }
}
