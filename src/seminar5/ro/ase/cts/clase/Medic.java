package seminar5.ro.ase.cts.clase;

public class Medic extends PersonalSpital{
    public Medic(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append("nume: ");
        sb.append(super.getNume());
        sb.append('}');
        return sb.toString();
    }
}
