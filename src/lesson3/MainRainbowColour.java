package lesson3;

import java.util.Scanner;

/**
 * 4.По введенному номеру определить цвет радуги (1 –
 * красный, 4 – зеленый и т. д.).
 */
public class MainRainbowColour {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numberOfRainbow :");
        int numberOfRainbow;
        if (sc.hasNextInt()) {
            numberOfRainbow = sc.nextInt();
            defineRainbowColour(numberOfRainbow);
        } else {
            System.out.println("Something went wrong, numberOfMonth should be integer...");
        }
        sc.close();
    }

    private static void defineRainbowColour(final int numberOfRainbow){
        switch (numberOfRainbow) {
            case 1 -> System.out.println("red");
            case 2 -> System.out.println("orange");
            case 3-> System.out.println("yellow");
            case 4 -> System.out.println("green");
            case 5 -> System.out.println("blue");
            case 6 -> System.out.println("blue2");
            case 7-> System.out.println("violet");
        }
    }
}
