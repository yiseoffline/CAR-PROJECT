package practice;

public class TV extends Electronic {
    private int inch;

    public TV() {
        this.volume = 0;
        this.type = "video";
        this.inch = 40;
    }

    @Override
    public void soundUp() {
        this.volume += 20;
    }

    @Override
    public void soundDown() {
        this.volume = Math.max(this.volume - 20, 0);
    }

    @Override
    public String eleMember() {
        return "type : " + this.type + " volume : " + this.volume + " inch : " + this.inch;
    }
}