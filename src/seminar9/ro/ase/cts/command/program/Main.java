package seminar9.ro.ase.cts.command.program;

import seminar9.ro.ase.cts.command.clase.*;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(1);
        Masa masa2 = new Masa(1);

        Comanda comandaRezervare = new ComandaRezervare(masa1);
        Comanda comandaOcupare = new ComandaOcupare(masa2);
        Comanda comandaOcupare1 = new ComandaOcupare(masa2);

        Operator operator = new Operator();
        operator.invoca(comandaRezervare);
        operator.executaComanda();
        operator.invoca(comandaOcupare);
        operator.invoca(comandaOcupare1);

        operator.executaComanda();
        operator.executaComanda();
    }
}
