package javabasics.javaadvanced.Inheritance._1;

public class Bird extends Animal{
    private double wingSpan;
    public Bird(double height, double weight,double wingSpan) {
        super(height, weight);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
    public double flySpeedMetersPerSecond(){
        return wingSpan*4;
    }
    @Override
    public String toString() {
        return "Height is: "+ getHeight()+
                " Weight is: "+ getWeight()+"" +
                " and wingspan is: "+wingSpan;
    }
}
