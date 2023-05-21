package javabasics.javaadvanced._6;

import static javabasics.javaadvanced._6.Days.SUNDAY;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     *
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     *
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        for ( Days day :Days.values()) {
            System.out.println(day);
        }
        // Your code here
    }

    /**
     * 2:
     *
     *
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     *
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        Seasons.rangeOfMounth(Seasons.SPRING);
        Seasons.rangeOfMounth(Seasons.SUMMER);
        Seasons.rangeOfMounth(Seasons.FALL);
        Seasons.rangeOfMounth(Seasons.WINTER);

        // Your code here
    }

    /**
     * 3:
     *
     *
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     *
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     *
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        System.out.println(TrafficLight.currentLight(TrafficLight.RED));
        System.out.println(TrafficLight.currentLight(TrafficLight.GREEN));
        System.out.println(TrafficLight.currentLight(TrafficLight.YELLOW));
        // Your code here
    }

    /**
     * 4:
     *
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     *
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        for (Days day : Days.values()){
            if (day == Days.SATURDAY || day == Days.SUNDAY) {
                System.out.println( day+ " it's weekend and i don't have finish my exercise");
            }else System.out.println(day+ " it's weekday and i have not still finish...");
        }
        // Your code here
    }

    /**
     * 5:
     *
     *
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     *
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");

        // Your code here

        double num1 = 5;
        double num2 = 2;
        int subtract = Operator.operation((int) num1,(int) num2,Operator.MULTIPLY);
        System.out.println(subtract);
    }

}
