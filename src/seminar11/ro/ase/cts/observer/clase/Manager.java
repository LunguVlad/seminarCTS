package seminar11.ro.ase.cts.observer.clase;

public class Manager extends ManagerSalaDeSport{
    public void anuntaMeci(String tipMeci){
        String mesaj = "Va avea loc un meci de " + tipMeci;
        super.notificaObservatori(tipMeci);
    }
}
