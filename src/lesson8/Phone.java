package lesson8;

import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public void receiveCall(final String name) {
        System.out.println("Incoming call: " + name);
    }

    public void receiveCall(final String name, final String number) {
        System.out.println("Incoming call:" + name + ", " + number);
    }

    public String getNumber() {
        return this.number;
    }

    public void sendMessage(String... destinationNumbers) {
        System.out.println("From this number " + this.number + " the message was send to this destination " + Arrays.toString(destinationNumbers));
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + this.number + '\'' +
                ", model='" + this.model + '\'' +
                ", weight=" + this.weight +
                '}';
    }
}
