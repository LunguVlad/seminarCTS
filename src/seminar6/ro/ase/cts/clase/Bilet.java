package seminar6.ro.ase.cts.clase;

import java.math.BigDecimal;

public class Bilet {
    private double pret;

    public Bilet(double pret){
        this.pret = pret;
    }

    public void vanzare(){
        System.out.println("S-a vandut biletul: " + this.pret);
    }

    public void rezervare(){
        System.out.println("S-a rezervat un bilet");
    }
}
