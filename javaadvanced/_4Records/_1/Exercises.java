package javabasics.javaadvanced._4Records._1;

import java.math.BigDecimal;
import java.math.BigInteger;

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
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     *
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     *
     * Experiment with different values of x and observe the output
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        int x = (int) (Math.random() *100);
        String y = x >= 50? "x is greater than or equal to 50" : "x is less than 50";
        System.out.println(y);
        // Your code here
    }

    /**
     * 2:
     *
     *
     * Create a record called "Person" with fields for name, age and address.
     *
     * Add a toString method to Person to print out the data in a different format
     *
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        Person giuseppe = new Person("giuseppe", 23, "via roma");
        System.out.println(giuseppe);
        // Your code here
    }

    /**
     * 3:
     *
     *
     * In the main method, create a BigInteger variable with a large value.
     *
     * Create a BigDecimal variable with a large value
     *
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     *
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     *
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        BigInteger bigI = new BigInteger("1211654851165845121988512133844000");
        BigDecimal bigD = new BigDecimal("11.548621548654895121221845151848000");

        bigI = bigI.divide(BigInteger.valueOf(3));
        try {
            bigD = bigD.divide(BigDecimal.valueOf(Math.PI));
        }catch (Exception e){
            System.out.println("credo che dividere per un valore decimale 'infinito' come quello del PI sia impossibile se non si usa un approssimazione" +"\n"
            +"comunque fammi sapere se l'exeption è dovuto a questo");
        }
        System.out.println(bigI);
        // Your code here
    }

}
