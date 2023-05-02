package javabasics.OOP._3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        Student student1 = new Student();
        student1.setName("Giuseppe");
        student1.setFavoriteColor("green");
        student1.setArePoor(true);
        student1.setAge(23);
        student1.setMoneyInPocket(0.12);

        System.out.println(student1.getName());
        System.out.println(student1.getFavoriteColor());
        System.out.println(student1.getArePoor());
        System.out.println(student1.getAge());
        System.out.println(student1.getMoneyInPocket());
        // Write and use your 5 getters and setters!
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        Student student2 = new Student();
        student2.setAge(-1);
        student2.setName(null);
        student2.setMoneyInPocket(-0.26);
        //Write your code here
    }

}
