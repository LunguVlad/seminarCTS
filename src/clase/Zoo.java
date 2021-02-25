package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements ZooInterface{
    private Zookeper zookeper;
    private List<Animal> animalList;

    public Zoo() {
        this.zookeper = new Zookeper("Gigel");
        this.animalList = new ArrayList<>();
    }

    public Zoo(Zookeper zookeper, List<Animal> animalList) {
        this.zookeper = zookeper;
        this.animalList = animalList;
    }

    public void addAnimal(Animal animal){
        animalList.add(animal);
    }

    public void feedAllAnimals(){
        for (Animal animal: animalList) {
            zookeper.feed(animal);
        }
    }
}
