package javabasics.javaadvanced._2Abstractclass._2;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    /**
     * 1:
     *
     * Create an abstract class called "Shape" with fields of height and width
     *
     * Create classes called "Rectangle" and "Circle" that extend the GeometricShape class and implement the calculateArea() method.
     *
     * Create instances of both and calculate their area
     *
     * To calculate the area copy the following code:  Math.PI * Math.pow((height / 2), 2)
     *
     * BONUS: Make sure the height and width values are exactly the same for Circle, change the constructor to do this
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        Rectangle rettangolo1 = new Rectangle(8,3);
        Circle cerchio1 = new Circle(8,3);

        System.out.println(rettangolo1.calculateArea());
        System.out.println(cerchio1.calculateArea());
        System.out.println(cerchio1.getHeight());
        System.out.println(cerchio1.getWidth());
        // Your code here
    }

    /**
     * 2:
     *
     *
     * Create an interface class called "Movable" that has the following methods: moveForward, moveBackward
     *
     * Create classes called "Car" and "Boat" that implement the Movable Interface
     *
     * Write code below that creates instances of both the Car and Boat class and demonstrates the use of the methods from the Movable interface.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        Car ferrari = new Car("296",125000);
        Boat forPoor = new Boat("peschereccio");

        ferrari.moveForward();
        forPoor.moveForward();
        ferrari.moveBackward();
        forPoor.moveBackward();
        // Your code here
    }

    /**
     * 3:
     *
     *
     * Create an interface called "Playable" with an abstract method called "play()".
     *
     * Create an abstract class called "Instrument" that implements the Playable interface and contains the fields "name" and "brand".
     *
     * Create classes called "Guitar" and "Piano" that extend the Instrument class and implement the play() method.
     *
     * Write code below that creates instances of both the Guitar and Piano class and demonstrates the use of the play() method.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        Instrument chitarra = new Guitar("non conosco nomi di chitarre","Yamaha?");
        Instrument pianoForte= new Piano("stesso di chitarra","Yamaha???");
        pianoForte.play();
        chitarra.play();

        // Your code here
    }
}
