package zoo.classes.animals.herbo;

public class Rabbit extends Herbo {
    public Rabbit(int food, int kindness) {
        super(food, kindness);
    }

    @Override
    public String getType() {
        return "Rabbit";
    }
}