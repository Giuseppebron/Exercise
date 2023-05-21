package javabasics.javaadvanced.Inheritance._1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        Dog pastoreTedesco= new Dog(55.5,95.35,"PastoreTedesco");
        System.out.println(pastoreTedesco);
        // Your code here
    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        Fish serra = new Fish(25.15,71.5,"Pomatomus saltatrix");
        System.out.println(serra);
        Bird inseparabile = new Bird(7,19.5,8.75);
        System.out.println(inseparabile);
        // Your code here
    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");

        Dog pastoreTedesco= new Dog(55.5,95.35,"PastoreTedesco");
        Fish serra = new Fish(25.15,71.5,"Pomatomus saltatrix");
        Bird inseparabile = new Bird(7,19.5,8.75);

        Map<Animal,Double> speedComparison = new HashMap<>();
        speedComparison.put(pastoreTedesco, pastoreTedesco.runSpeedMetersPerSecond());
        speedComparison.put(serra, serra.swimSpeedMetersPerSecond());
        speedComparison.put(inseparabile, inseparabile.flySpeedMetersPerSecond());
        double x = Double.MIN_VALUE;
        String fastest = null;
        for (Map.Entry<Animal, Double> speed: speedComparison.entrySet()) {
            if (speed.getValue() > x){
                x =speed.getValue();
            }if(speedComparison.containsValue(x)){
                fastest = speed.getKey().toString();
            }
        }
        System.out.println(x);
        System.out.println(fastest);
        // Your code here

    }
}
