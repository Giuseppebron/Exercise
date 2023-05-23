package javabasics.javaadvanced._1Inheritance._1;

public class Dog extends Animal{
    private String breed;
    public Dog(double height, double weight, String breed) {
        super(height, weight);
        this.breed = breed;
    }

    public  String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public double runSpeedMetersPerSecond(){
        return getHeight()*2;
    }

    @Override
    public String toString() {
        return "Height is: "+ getHeight()+
                " Weight is: "+ getWeight()+"" +
                " and breed is: "+breed;
    }
}
