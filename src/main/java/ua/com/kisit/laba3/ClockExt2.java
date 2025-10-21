package ua.com.kisit.laba3;

public class ClockExt2 extends ClockExt{
    private int milliseconds;

    public static void main(String[] args) {
        ClockExt2 clockExt2 = new ClockExt2();
        System.out.println(clockExt2);
    }

    public void addMilliseconds(){
        milliseconds+=10;
        if (milliseconds >= 1000) {
            addSeconds();
            milliseconds = 0;
        }
    }

    @Override
    public String toString() {
        return "ClockExt2{"+ getHours() +
                ":" + getMinutes() +
                ":" + getSeconds() +
                ":" + getMilliseconds() +'}';
    }

    public ClockExt2() {}

    public ClockExt2(int milliseconds) {
        this.milliseconds = milliseconds;
    }

    public ClockExt2(int hours, int minutes, int seconds, int milliseconds) {
        super(hours, minutes, seconds);
        this.milliseconds = milliseconds;
    }

    public int getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(int milliseconds) {
        this.milliseconds = milliseconds;
    }
}
