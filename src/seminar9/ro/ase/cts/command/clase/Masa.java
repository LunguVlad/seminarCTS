package seminar9.ro.ase.cts.command.clase;

public class Masa {
    private int nrMasa;
    private Boolean esteOcupata;
    private Boolean esteRezervata;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        this.esteOcupata = false;
        this.esteRezervata = false;
    }

    public void ocupaMasa(){
        if(!this.esteOcupata){
            this.esteOcupata = true;
            System.out.println("Masa poate fi ocupata!");
        }
        else{
            System.out.println("Masa este deja ocupata!");
        }
    }
    public void rezervaMasa(){
        if(!this.esteRezervata){
            this.esteRezervata = true;
            System.out.println("Masa poate fi rezervata!");
        }
        else{
            System.out.println("Masa este deja rezervata!");
        }
    }
}
