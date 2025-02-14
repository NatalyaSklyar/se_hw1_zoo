package zoo.classes.things;
import zoo.interfaces.IInventory;

public abstract class Thing implements IInventory {
    protected int number;

    public Thing() {}


    @Override
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int getNumber() {
        return number;
    }
}