package ua.com.kisit.laba3;

public class ClockExt extends Clock{
    private int seconds;

    public static void main(String[] args) {
        Clock clockExt = new ClockExt();
        System.out.println(clockExt);
    }

    public void addSeconds(){
        seconds++;
        if (seconds >= 60) {
            addMinutes();
            seconds = 0;
        }
    }

    @Override
    public String toString() {
        return "ClockExt{"+ getHours() +
                ":" + getMinutes() +
                ":" + seconds + '}';
    }

    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public ClockExt() {}

    public ClockExt(int seconds) {
        this.seconds = seconds;
    }

    public ClockExt(int hours, int minutes, int seconds) {
        super(hours, minutes);
        this.seconds = seconds;
    }
}
