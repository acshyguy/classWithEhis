package ac;

public class MainClock {
    public static void main(String[] args) {

        Clock clock = new Clock(22,43,34);

        System.out.println(clock.displayTime());
        clock.setHour(24);
        clock.setMinute(60);
        clock.setSecond(11);
        System.out.println(clock.displayTime());

    }
}
