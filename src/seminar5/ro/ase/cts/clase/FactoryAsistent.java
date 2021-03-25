package seminar5.ro.ase.cts.clase;

public class FactoryAsistent implements IFactory {
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Asistent(nume);
    }
}
