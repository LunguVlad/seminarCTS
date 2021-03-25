package seminar5.ro.ase.cts.clase;

public class FactoryBrancardier implements IFactory{
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Brancardier(nume);
    }
}
