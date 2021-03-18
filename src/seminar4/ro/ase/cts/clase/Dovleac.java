package seminar4.ro.ase.cts.clase;

public class Dovleac {
    String tip;
    double greutate;
    float pretPeKg;

    private Dovleac() {
        this.tip = "Simplu";
        this.greutate = 5;
        this.pretPeKg = 2.5F;
    }

    private Dovleac(String tip, double greutate, float pretPeKg) {
        this.tip = tip;
        this.greutate = greutate;
        this.pretPeKg = pretPeKg;
    }

    private static Dovleac instance = null;

    public static synchronized Dovleac getInstance(String tip,double greutate,float pretPeKg) {
            if (instance == null) {
                instance = new Dovleac(tip, greutate, pretPeKg);
            }

            return instance;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public void setPretPeKg(float pretPeKg) {
        this.pretPeKg = pretPeKg;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dovleac{");
        sb.append("tip='").append(tip).append('\'');
        sb.append(", greutate=").append(greutate);
        sb.append(", pretPeKg=").append(pretPeKg);
        sb.append('}');
        return sb.toString();
    }
}
