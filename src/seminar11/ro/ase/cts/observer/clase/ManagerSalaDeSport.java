package seminar11.ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class ManagerSalaDeSport {
    private List<Observator> observatori;

    public ManagerSalaDeSport() {
        this.observatori = new ArrayList<>();
    }

    public void adaugaObservator(Observator observator){
        observatori.add(observator);
    }

    public void stergeObservator(Observator observator){
        observatori.remove(observator);
    }

    public void notificaObservatori(String mesajNotificare){
        for(Observator o : observatori){
            o.primesteMesaj(mesajNotificare);
        }
    }
}
