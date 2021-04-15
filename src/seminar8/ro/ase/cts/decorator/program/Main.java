package seminar8.ro.ase.cts.decorator.program;

import seminar8.ro.ase.cts.decorator.clase.DecoratorAbstract;
import seminar8.ro.ase.cts.decorator.clase.DecoratorCuLaMultiAni;
import seminar8.ro.ase.cts.decorator.clase.DecoratorUrarePaste;
import seminar8.ro.ase.cts.decorator.clase.NotaDePlata;

public class Main {
    public static void main(String[] args) {

        NotaDePlata notaInitiala = new NotaDePlata(50);
        notaInitiala.printeaza();

        DecoratorAbstract decoratorLaMultiAni = new DecoratorCuLaMultiAni(notaInitiala);
        decoratorLaMultiAni.printeazaFelicitare();
        decoratorLaMultiAni.printeaza();

        DecoratorAbstract decoratorUrarePaste = new DecoratorUrarePaste(notaInitiala);
        decoratorUrarePaste.printeazaFelicitare();
        decoratorUrarePaste.printeaza();

        NotaDePlata notaDePlata = new NotaDePlata(70);
        DecoratorAbstract decoratorLaMultiAni2 = new DecoratorCuLaMultiAni(notaDePlata);
        DecoratorAbstract decoratorUrarePaste2 = new DecoratorUrarePaste(decoratorLaMultiAni2);

        decoratorUrarePaste2.printeaza();
    }
}
