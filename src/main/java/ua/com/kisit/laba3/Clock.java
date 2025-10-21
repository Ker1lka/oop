package ua.com.kisit.laba3;

public class Clock {
    private int hours;
    private int minutes;

    public static void main(String[] args) {
        Clock clock = new Clock();
        System.out.println(clock);
    }

    public void addMinutes() {
        minutes++;
        if (minutes >= 60) {
            minutes = 0;
            hours++;

        }
        if (hours >= 24) {
            hours = 0;
        }
    }

    @Override
    public String toString() {
        return "Clock{" + hours +
                ":" + minutes + '}';
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public Clock() {
    }

    public Clock(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }
}
