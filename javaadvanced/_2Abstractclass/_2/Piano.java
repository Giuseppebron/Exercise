package javabasics.javaadvanced._2Abstractclass._2;

public class Piano extends Instrument{
    public Piano(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("sto usando il play methods da piano");
    }
}
