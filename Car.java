package practice;

public class Car {
    private int speed;
    private String no;
    private String color;
    private static int count = 0;

    public Car() {
        this.speed = 0;
        this.no = null;
        this.color = null;
        count += 1;
    }

    public Car(int speed, String color) {
        this.speed = speed;
        this.no = null;
        this.color = color;
        count += 1;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void speedUp() {
        this.speed += 10;
    }

    public void speedUp(int x) {
        this.speed += x;
    }

    public void speedDown() {
        this.speed = Math.max(this.speed - 10, 0);
    }

    public void speedDown(int x) {
        this.speed = Math.max(this.speed - x, 0);
    }

    public void carMember() {
        System.out.printf("speed : %3d no : %10s color : %10s", this.speed, this.no, this.color);
    }

    public int compareTo(Car car) {
        return Integer.compare(this.speed, car.speed);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return speed == car.speed && color.equals(car.color);
    }
}