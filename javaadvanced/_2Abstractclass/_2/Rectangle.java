package javabasics.javaadvanced._2Abstractclass._2;

public class Rectangle extends Shape {
    public Rectangle(double height, double width) {
        super(height, width);
    }
    public double calculateArea(){
        double area = getHeight()*getWidth();
        return area;
    }
}
