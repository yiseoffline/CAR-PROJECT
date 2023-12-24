package practice;

public class Sedan extends Car implements Sound {
    private static int scount = 0;
    private int volume;
    private int cc;

    public Sedan() {
        super();
        scount += 1;
        super.setNo("01-00" + scount);
    }

    public Sedan(int speed, String color, int cc) {
        super(speed, color);
        scount += 1;
        super.setNo("01-00" + scount);
        this.cc = cc;
    }

    @Override
    public void soundUp() {
        this.volume = Math.min(this.volume + 12, 100);
    }

    @Override
    public void soundDown() {
        this.volume = Math.max(this.volume - 12, 0);
    }

    @Override
    public void speedUp() {
        super.setSpeed(Math.min(super.getSpeed() + 10, 200));
    }

    @Override
    public void speedUp(int x) {
        super.setSpeed(Math.min(super.getSpeed() + x, 200));
    }

    @Override
    public void carMember() {
        super.carMember();
        System.out.printf(" cc : %d volume : %d%n", this.cc, this.volume);
    }
}