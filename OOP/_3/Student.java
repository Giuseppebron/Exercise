package javabasics.OOP._3;

public class Student {
    private String name;
    private String favoriteColor;
    private boolean arePoor;
    private int age;
    private double moneyInPocket;


     public void setName(String name){
         if (name != null){
         this.name = name;
         }else {
             System.out.println("name is null");
         }
     }public String GetName(){
         return name;
     }public String getName(){
         return name;
    }

     public void setFavoriteColor(String favoriteColor){
         this.favoriteColor = favoriteColor;
     }public  String getFavoriteColor(){
         return favoriteColor;
     }
     public void setArePoor(Boolean arePoor){
         this.arePoor = arePoor;

     }public Boolean getArePoor(){
         return arePoor;
    }

     public void setAge(int age){
         if (age>=0 && age< 130) {
             this.age = age;
         }else {
             System.out.println("invalid age");
         }
     }public int getAge(){
         return age;
    }
     public void setMoneyInPocket(double moneyInPocket){
         if (moneyInPocket >= 0 ) {
             this.moneyInPocket = moneyInPocket;
         }else {
             System.out.println("you are poor but you can not go in negative balance in your pocket");
         }
     }public double getMoneyInPocket(){
         return moneyInPocket;
    }
}
