package practice;

public class Radio extends Electronic {
    private int price;

    public Radio() {
        this.volume = 0;
        this.type = "audio";
        this.price = 10000;
    }

    @Override
    public void soundUp() {
        this.volume += 15;
    }

    @Override
    public void soundDown() {
        this.volume = Math.max(this.volume - 15, 0);
    }

    @Override
    public String eleMember() {
        return "type : " + this.type + " volume : " + this.volume + " price : " + this.price;
    }
}