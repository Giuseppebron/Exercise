package javabasics.javaadvanced._2Abstractclass._2;

public class Car implements Movable{
    private String model;
    private int kilometer;

    public Car(String model, int kilometer) {
        this.model = model;
        this.kilometer = kilometer;
    }

    @Override
    public void moveForward() {
        System.out.println("la macchina va avanti");
    }

    @Override
    public void moveBackward() {
        System.out.println("la macchina va indietro");
    }
}
