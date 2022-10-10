package lesson6;

public class Computer {
    private final double price;
    private final String model;
    private final HDD hdd;
    private final RAM ram;

    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
        this.hdd = new HDD();
        this.ram = new RAM();
    }

    public Computer(double price, String model, HDD hdd, RAM ram) {
        this.price = price;
        this.model = model;
        this.hdd = hdd;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer " + "{ price= " + this.price + ", " + "model=" + this.model + ", " + "hdd=" + this.hdd + ", " + "ram=" + this.ram +
                "}";
    }

}
