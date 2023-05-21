package javabasics.javaadvanced._6;

public enum Seasons {
    SPRING,
    SUMMER,
    FALL,
    WINTER;


    static final String rangeSpring= "march to june";
    static final String rangeSummer= "june to september";
    static final String rangeFall= "september to december";
    static final String rangeWinter= "december to march";


    public static Seasons rangeOfMounth(Seasons s) {
       switch (s){
           case SPRING:
               System.out.println(rangeSpring);
               break;
           case SUMMER:
               System.out.println(rangeSummer);
               break;
           case FALL:
               System.out.println(rangeFall);
               break;
           case WINTER:
               System.out.println(rangeWinter);
               break;
       }
        return s;
    }
}
