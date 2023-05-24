package javabasics.javaadvanced._4Records._1;

public record Person(String name, int age, String address) {
    @Override
    public String toString() {
        return "name= " + name +
                ", age= " + age +
                ", address= " + address ;
    }
}
