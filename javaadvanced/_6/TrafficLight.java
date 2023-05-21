package javabasics.javaadvanced._6;

public enum TrafficLight {
    RED,
    YELLOW,
    GREEN;

    public static TrafficLight currentLight(TrafficLight t){
        switch (t){
            case RED: return GREEN;
            case GREEN: return YELLOW;
            case YELLOW: return RED;
        }
        return t;
    }
}
