package subiecteACS.C.Ex3.main;

import subiecteACS.C.Ex3.clase.BuilderFactura;
import subiecteACS.C.Ex3.clase.Factura;

public class Main {
    public static void main(String[] args) {
        Factura factura = new BuilderFactura().setCerePungi(true).build();

        System.out.println(factura.toString());
    }
}
