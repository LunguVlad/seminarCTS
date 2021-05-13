package seminar11.ro.ase.cts.observer.clase;

public class Client implements Observator{

    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(this.nume + " ai primit mesajul " + mesaj);
    }
}
