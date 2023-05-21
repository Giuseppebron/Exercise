package javabasics.javaadvanced._6;

public enum Operator {
    ADD,
    SUBSTACT,
    MULTIPLY,
    DIVIDE;



    public static int operation (int x, int y, Operator o) {
        int z = 0;
        if (o == ADD) {
            z = x + y;
        } else if (o == SUBSTACT) {
            z = x - y;
        } else if (o == MULTIPLY) {
            z= x * y;
        } else if (o == DIVIDE) {
            z= x / y;

        }
        return z;
    }
}
