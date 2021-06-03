package seminar13.ro.ase.cts.test.mockuri;

import seminar13.ro.ase.cts.clase.IStudent;

import java.util.List;

public class StubStudent implements IStudent {
    @Override
    public String getNume() {
        return "Gigel";
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return null;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return 5.5f;
    }

    @Override
    public int getNota(int index) {
        return 10;
    }

    @Override
    public boolean areRestante() {
        return false;
    }
}
