package practice;

public class Bus extends Car implements Sound {
    private static final int MAX_VOLUME = 100;
    private static final int VOLUME_INCREMENT = 6;
    private static final int MAX_SPEED = 100;
    private static final int SPEED_INCREMENT = 10;

    private int volume = 0;
    private static int busCount = 0;
    private int numberOfPassengers;

    public Bus() {
        super();
        busCount++;
        super.setNo("02-00" + busCount);
    }

    public Bus(int speed, String color, int numberOfPassengers) {
        super(speed, color);
        busCount++;
        super.setNo("02-00" + busCount);
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public void soundUp() {
        volume = Math.min(volume + VOLUME_INCREMENT, MAX_VOLUME);
    }

    @Override
    public void soundDown() {
        volume = Math.max(volume - VOLUME_INCREMENT, 0);
    }

    @Override
    public void speedUp() {
        setSpeed(Math.min(getSpeed() + SPEED_INCREMENT, MAX_SPEED));
    }

    @Override
    public void speedUp(int increment) {
        setSpeed(Math.min(getSpeed() + increment, MAX_SPEED));
    }

    @Override
    public void carMember() {
        super.carMember();
        System.out.printf("Passengers: %6s Volume:  %10d", numberOfPassengers, volume);
        System.out.println();
    }
}