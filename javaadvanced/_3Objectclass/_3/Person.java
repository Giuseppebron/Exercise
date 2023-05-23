package javabasics.javaadvanced._3Objectclass._3;

public class Person {
    private String name;
    private int age;
    private String adress;

    public Person(String name, int age, String adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Tizzio fa di nome "+ name + " ha "+age+" anni e sta in "+ adress;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age + adress.hashCode();
    }
}
