package practice;

public class Truck extends Car implements Sound {
    private int volume;
    static int tcount = 0;
    private int ton;

    public Truck() {
        super();
        tcount += 1;
        super.setNo("03-00" + tcount);
    }

    public Truck(int speed, String color, int ton) {
        super(speed, color);
        tcount += 1;
        super.setNo("01-00" + tcount);
        this.ton = ton;
    }

    @Override
    public void soundUp() {
        this.volume = Math.min(this.volume + 8, 100);
    }

    @Override
    public void soundDown() {
        this.volume = Math.max(this.volume - 8, 0);
    }

    @Override
    public void speedUp() {
        super.setSpeed(Math.min(super.getSpeed() + 10, 80));
    }

    @Override
    public void speedUp(int x) {
        super.setSpeed(Math.min(super.getSpeed() + x, 80));
    }

    @Override
    public void carMember() {
        super.carMember();
        System.out.printf(" ton : %10d volume :  %9d%n", this.ton, this.volume);
    }
}