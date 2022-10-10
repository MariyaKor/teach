package lesson6;

public class HDD {
    private String title;
    private int volume;
    private String type;

    public HDD() {
    }

    public HDD(String title, int volume, String type) {
        this.title = title;
        this.volume = volume;
        this.type = type;
    }

    @Override
    public String toString() {
        return "{title= " + this.title + ", " + "volume=" + this.volume + "GB, " + this.type + "}";
    }
}
