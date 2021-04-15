package seminar8.ro.ase.cts.decorator.clase;

public class NotaDePlata implements INota{

    private int sumaDePlata;

    public NotaDePlata (int sumaDePlata){
        this.sumaDePlata = sumaDePlata;
    }


    @Override
    public void printeaza() {
        System.out.println(String.format("S-a printat nota de plata cu suma: %d",sumaDePlata));
    }
}
