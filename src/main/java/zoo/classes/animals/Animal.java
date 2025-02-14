package zoo.classes.animals;
import zoo.interfaces.IAlive;
import zoo.interfaces.IInventory;

public abstract class Animal implements IAlive, IInventory {
    protected int food;
    protected int number = 0;

    public Animal(int food) {
        this.food = food;
    }

    @Override
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int getFood() {
        return food;
    }

    @Override
    public int getNumber() {
        return number;
    }

    public abstract String getType();
}