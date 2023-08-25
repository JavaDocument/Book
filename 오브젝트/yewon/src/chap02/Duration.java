package chap02;

public class Duration {
    private int minutes;

    public Duration(int minutes) {
        this.minutes = minutes;
    }

    public static Duration ofMinutes(int minutes) {
        return new Duration(minutes);
    }
}
