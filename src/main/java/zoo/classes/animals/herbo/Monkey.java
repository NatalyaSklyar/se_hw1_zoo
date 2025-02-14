package zoo.classes.animals.herbo;

public class Monkey extends Herbo {
    public Monkey(int food, int kindness) {
        super(food, kindness);
    }

    @Override
    public String getType() {
        return "Monkey";
    }
}