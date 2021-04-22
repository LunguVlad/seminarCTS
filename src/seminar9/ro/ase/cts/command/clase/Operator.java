package seminar9.ro.ase.cts.command.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Comanda> comenzi = new ArrayList<>();

    public void invoca(Comanda comanda){
        comenzi.add(comanda);
    }

    public void executaComanda(){
        this.comenzi.get(0).executa();
        this.comenzi.remove(0);
    }


}
