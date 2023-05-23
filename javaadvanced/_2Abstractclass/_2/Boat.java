package javabasics.javaadvanced._2Abstractclass._2;

public class Boat implements Movable {
    private String typeOfBoat;

    public Boat(String typeOfBoat) {
        this.typeOfBoat = typeOfBoat;
    }

    @Override
    public void moveForward() {
        System.out.println("la barca va avanti");
    }

    @Override
    public void moveBackward() {
        System.out.println("la barca va indietro");
    }
}
