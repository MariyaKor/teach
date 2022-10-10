package lesson6;

public class RAM {
    private String title;
    private int volume;

    public RAM() {
    }

    public RAM(String title, int volume) {
        this.title = title;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "{title= " + this.title + ", " + "volume=" + this.volume +"GB "+ "}";
    }
}
