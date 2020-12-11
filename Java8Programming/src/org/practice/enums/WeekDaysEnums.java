package org.practice.enums;

enum WeekDays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class WeekDaysEnums {
    public static void main(String[] args){
        System.out.println("Today is " +WeekDays.FRIDAY);
        System.out.println("Tomorrow it would be " + WeekDays.SATURDAY);
        System.out.println("Yesterday it was " + WeekDays.THURSDAY);
        WeekDays dayOfTheWeek = WeekDays.SUNDAY;
        switch (dayOfTheWeek){
            case MONDAY:
                System.out.println("Today is Monday");
            case TUESDAY:
                System.out.println("Today is Tuesday");
            case  WEDNESDAY:
                System.out.println("Today is Wednesday");
            default:
                System.out.println("Today is Holiday");
        }
    }
}
