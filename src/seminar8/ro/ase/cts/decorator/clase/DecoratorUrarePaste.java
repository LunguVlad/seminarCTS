package seminar8.ro.ase.cts.decorator.clase;

public class DecoratorUrarePaste extends DecoratorAbstract{

    public DecoratorUrarePaste(INota nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("FELICITARE: Paste fericit!");
    }

    @Override
    public void printeaza() {
        super.printeaza();
        System.out.println("Paste fericit!");
    }
}
