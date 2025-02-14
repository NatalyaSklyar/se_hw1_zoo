package zoo.classes.animals.predator;

public class Tiger extends Predator {
    public Tiger(int food) {
        super(food);
    }

    @Override
    public String getType() {
        return "Tiger";
    }
}
