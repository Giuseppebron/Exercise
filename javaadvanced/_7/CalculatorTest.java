package javabasics.javaadvanced._7;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

class CalculatorTest {
    /**
     * 1:
     *
     *
     * Create JUnit test for the add() and subtract() methods in the Calculator class.
     *
     * Test the methods with multiple test cases, including positive and negative numbers, and zero.
     *
     * Verify that the methods return the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise1() {
        System.out.println("\nExercise 1: ");
        int a = 0;
        int b = -1;
        Calculator addizione = new Calculator();
        Assertions.assertTrue(a+b == addizione.add(a,b));
        Assertions.assertTrue(a-b == addizione.subtract(a,b));
        System.out.println("Test 1 completed");
        // Your code here
    }

    /**
     * 2:
     *
     *
     * Create JUnit test for the multiply() and divide() methods in the Calculator class.
     *
     * Test the same kind of inputs as before as exercise 1
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     */
    @Test
    void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        int a = 3;
        int b = -1;
        Calculator calculator = new Calculator();
        Assertions.assertTrue(a*b == calculator.multiply(a,b));
        Assertions.assertTrue(a/b == calculator.divide(a,b));
        System.out.println("test 2 completed");
        //Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }

    /**
     * 3:
     *
     * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
     * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
     * Test with decimals too!
     * Verify that the method returns the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     * Don't just write tests that use the result of the program as the expected!!
     */
    @Test
    void exercise3() {
        System.out.println("\nExercise 3: ");
        double a = 1;
        double b = 3;
        double c = 1;

        Calculator pow = new Calculator();
        Assertions.assertEquals(8,pow.power(2,3));
        Assertions.assertEquals(0,pow.power(0,3));
        Assertions.assertEquals(4,pow.power(-2,2));
        Assertions.assertEquals(1.44,pow.power(1.20,2));
        System.out.println("test 3 completed");
        /*for (; b != 0; --b) {
            c = c * a;
            return;
        }
        System.out.println("test 3 completed... but not for double...sigh");
        Assertions.assertEquals(c, pow.power(a, b));*/
        // Your code here
    }
}