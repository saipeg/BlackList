package enums;

import java.util.Arrays;

public class DayOfWeek {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.SUNDAY); //type save
        today.daysInfo();
        WeekDays w = WeekDays.FRIDAY;

        WeekDays[] arrayOfWeekDays = WeekDays.values();
        System.out.println("arrayOfWeekDays = " + Arrays.toString(arrayOfWeekDays));
    }

}

enum WeekDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;
    private WeekDays(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}

class Today {
    WeekDays weekDays;

    public Today(WeekDays weekDays) {
        this.weekDays = weekDays;
    }

    void daysInfo() {
        switch (weekDays) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.printf("go to WORK!!!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Take a relax");
                break;
        }

        System.out.println("I feel today: " + weekDays.getMood());
    }
}
