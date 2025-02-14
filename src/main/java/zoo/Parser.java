package zoo;

import org.springframework.stereotype.Service;
import zoo.classes.animals.herbo.Monkey;
import zoo.classes.animals.herbo.Rabbit;
import zoo.classes.animals.predator.Tiger;
import zoo.classes.animals.predator.Wolf;
import zoo.classes.things.Computer;
import zoo.classes.things.Table;

import java.util.Scanner;

@Service
public class Parser {
    private final Zoo zoo;
    private final Scanner scanner = new Scanner(System.in);

    public Parser(Zoo zoo) {
        this.zoo = zoo;
    }

    public void start() {
        System.out.println("Добро пожаловать в систему управления зоопарком!");
        System.out.println("Введите команду или 'exit' для выхода:");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            String[] parts = input.split("\\s+", 4);
            String command = parts[0];

            switch (command) {
                case "add":
                    if (parts.length < 2) {
                        System.out.println("Error");
                        continue;
                    }
                        int food;
                        int kindness;
                        switch (parts[1]) {

                            case "Tiger":
                                food = Integer.parseInt(parts[2]);
                                zoo.addAnimal(new Tiger(food));
                                break;
                            case "Wolf":
                                food = Integer.parseInt(parts[2]);
                                zoo.addAnimal(new Wolf(food));
                                break;
                            case "Rabbit":
                                food = Integer.parseInt(parts[2]);
                                kindness = Integer.parseInt(parts[3]);
                                zoo.addAnimal(new Rabbit(food, kindness));
                                break;
                            case "Monkey":
                                food = Integer.parseInt(parts[2]);
                                kindness = Integer.parseInt(parts[3]);
                                zoo.addAnimal(new Monkey(food, kindness));
                                break;
                            case "Table":
                                zoo.addThing(new Table());
                            case "Computer":
                                zoo.addThing(new Computer());
                        }
                    break;
                case "zoo":
                    zoo.printZooInfo();
                    break;
                case "contact_zoo":
                    zoo.printContactZooInfo();
                    break;
                case "zoo_size":
                    zoo.countAnimals();
                    break;
                case "contact_zoo_size":
                    zoo.countContactAnimals();
                    break;
                case "food":
                    zoo.calculateFood();
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Invaluable command");
            }
        }
    }
}