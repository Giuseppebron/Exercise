package javabasics._4;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        int age = 23;
        System.out.println("my age is " + age);
        // Write your code here
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        char initial = 'g';
        int age = 23;
        System.out.println("My age =" + age + " my inital=" + initial );
        //Write your code here
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        boolean hasEatenLunch = false;                         /*sta dichiarando un valore boleano legato alla variabile hasEatenLunch*/

        double lunchCost = 5.99;                               /*sta dichiarando un valore double (con cifre dopo la virgola) legato alla variabile lunchCost*/

        System.out.println("Lunch cost=" + lunchCost);         /* stampare e aggiungere il valore di lunchCost */
        System.out.println("Has Eaten lunch=" + hasEatenLunch);/* stampare e aggiungere il valore di hasEatenLunch*/
    }
}
