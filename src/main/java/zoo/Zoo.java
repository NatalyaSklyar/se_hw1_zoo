package zoo;

import org.springframework.stereotype.Component;
import zoo.classes.animals.Animal;
import zoo.classes.animals.herbo.Herbo;
import zoo.classes.things.Thing;
import zoo.interfaces.IInventory;

import java.util.ArrayList;
import java.util.List;

@Component
public class Zoo {
    private final VetClinic vetClinic;
    private final List<IInventory> inventory = new ArrayList<>();
    private int inventoryCounter = 0;

    public Zoo(VetClinic vetClinic) {
        this.vetClinic = vetClinic;
    }

    public void addThing(Thing thing) {
        addInventory(thing);
    }

    public void addAnimal(Animal animal) {
        if(vetClinic.checkHealth(animal)) {
            addInventory(animal);
            System.out.println("Animals is added in zoo");
        }
        else{
            System.out.println("Animals is not healthy enough");
        }
    }

    private void addInventory(IInventory item) {
        inventoryCounter++;
        item.setNumber(inventoryCounter);
        inventory.add(item);
    }

    public void countAnimals() {
        int amount = 0;
        for (IInventory iInventory : inventory) {
            if (iInventory instanceof Animal)
                amount += 1;
        }
        System.out.println("In zoo there are: " + amount + "animals");
    }

    public void countContactAnimals() {
        int amount = 0;
        for (IInventory iInventory : inventory) {
            if (iInventory instanceof Herbo)
                if (((Herbo) iInventory).getKindness() > 5) {
                    amount += 1;
                }
        }
        System.out.println("In zoo there are: " + amount + "contact animals");
    }


    public List<Animal> getAnimals() {
        List<Animal> animals = new ArrayList<Animal>();
        for (IInventory iInventory : inventory) {
            if (iInventory instanceof Animal) {
                animals.add((Animal) iInventory);
            }
        }
        return animals;
    }

    public List<Animal> getContactAnimals() {
        List<Animal> animals = new ArrayList<Animal>();
        for (IInventory iInventory : inventory) {
            if (iInventory instanceof Herbo)
                if (((Herbo) iInventory).getKindness() > 5)
                    animals.add((Animal)iInventory);
        }
        return animals;
    }

    public void printZooInfo() {
        System.out.println("In zoo are: " + getAnimals());
    }

    public void printContactZooInfo() {
        System.out.println("in contact zoo are: " + getContactAnimals());
    }

    public void calculateFood() {
        int food = 0;
        for (IInventory iInventory : inventory) {
            if (iInventory instanceof Animal)
                food += ((Animal) iInventory).getFood();
        }
        System.out.println("In zoo every day is eaten: " + food + "kg of food");
    }
}