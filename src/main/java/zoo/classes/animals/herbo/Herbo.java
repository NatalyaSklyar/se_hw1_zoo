package zoo.classes.animals.herbo;
import zoo.classes.animals.Animal;

public abstract class Herbo extends Animal {
    protected int kindness;

    public Herbo(int food, int kindness) {
        super(food);
        this.kindness = kindness;
    }

    public int getKindness() {
        return kindness;
    }
}