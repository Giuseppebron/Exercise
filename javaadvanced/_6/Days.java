package javabasics.javaadvanced._6;

public enum Days {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRYDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private boolean isWeekend ;

    Days (boolean isWeekend) {
        this.isWeekend = isWeekend;
    }
}
