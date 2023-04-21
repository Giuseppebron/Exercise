package javabasics._13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Add 8 random integers to the array list
     * <p>
     * Print out the first item
     * <p>
     * Remove the first 3 items
     * <p>
     * The print out the first remaining item
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");
        ArrayList<Integer> numbers = new ArrayList<>();
        //Write your code here
        numbers.add(1);
        numbers.add(7);
        numbers.add(14);
        numbers.add(19);
        numbers.add(67);
        numbers.add(85);
        numbers.add(121);
        numbers.add(153);

        System.out.println(numbers.get(0));
        numbers.remove(0);
        numbers.remove(0);
        numbers.remove(0);
        System.out.println(numbers.get(0));
    }

    /**
     * 2: Create 2 Array Lists,
     * <p>
     * A list of strings called 'menuItems'
     * <p>
     * And a list of Doubles called 'menuPrices'
     * <p>
     * The indexes of these two lists correspond to eachother
     * <p>
     * Create a print statement to output the name and price of each
     * menu item correspond
     */
    public static void exercise2() {
        System.out.println("\nExercise 1:");
        //Write your code here
        ArrayList<String>  menuItems = new ArrayList<String>();
        ArrayList<Double> menuPrices = new ArrayList<Double>();

        menuItems.add("coffe");
        menuItems.add("croissant");
        menuItems.add("jam");

        menuPrices.add(1.20);
        menuPrices.add(1.50);
        menuPrices.add(0.30);

        for (int i = 0; i < menuItems.size(); i++){
            System.out.println("you can have a " + menuItems.get(i) + " for " + menuPrices.get(i) + "€" );
        }


    }

    /**
     * * 3: I changed this to an int array after recording!
     * <p>
     * You'll still need to find the total but using [index] instead of .get(index)
     * <p>
     * Find the total sum of all items in the ArrayList below.
     * <p>
     * Use the + operator
     * <p>
     * print the total
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");
        int[] items = new int[]{5, 10404, -234348, -53, 9, 91, 92, 34534, 12334, 1435};

        //Write your code here
        for (int i=1; i< items.length ; i++){ //credo di essermi complicato inutilmente l'esercizio,
            items[0] = items[0] + items[i];   //so' che ho modificato la posizione 0 dell'array ,se
            System.out.println(items[0]);     //se volessi risettarne il valore a 5 potrei farlo tramite un if
        }                                     //ma ripeto, credo di essermi complicato inutilmente l'esercizio
    }
}
