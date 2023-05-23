package javabasics.javaadvanced._2Abstractclass._2;

public class Circle extends Shape{
    public Circle(double height, double width) {
        super(height =(height +width) /2 ,//ovviamente di base andrebbe messo il raggio
                width=height);            //o il diametro diviso 2 ma per usare il "super"
    }                                     //ho pensato a questa soluzione.

    public double calculateArea(){
        double area = Math.PI * Math.pow((getWidth() / 2), 2);
        return area;
    }
}
