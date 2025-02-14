package zoo;

import org.springframework.stereotype.Service;
import zoo.classes.animals.Animal;
import java.util.Random;

@Service
public class VetClinic {
    private final Random healthChecker = new Random();

    public boolean checkHealth(Animal animal) {
        return healthChecker.nextBoolean();
    }
}