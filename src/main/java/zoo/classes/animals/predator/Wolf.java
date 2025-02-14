package zoo.classes.animals.predator;

public class Wolf extends Predator {
    public Wolf(int food) {
        super(food);
    }

    @Override
    public String getType() {
        return "Wolf";
    }
}