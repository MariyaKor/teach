package lesson3;

import java.util.Scanner;

/**
 * 3.Для введенного числа t (температура на улице) вывести
 * Если t>–5, то вывести «Тепло».
 * Если –5>= t > –20, то вывести «Нормально».
 * Если –20>= t, то вывести «Холодно».
 */
public class MainTemperature {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature :");
        int temperature;
        if (sc.hasNextInt()) {
            temperature = sc.nextInt();
            defineTemperature(temperature);
        } else {
            System.out.println("Something went wrong, numberOfMonth should be integer...");
        }
        sc.close();
    }

    private static void defineTemperature(final int temperature) {
        if (temperature > -20 & temperature <= -5) {
            System.out.println("Нормально");
        } else if (temperature <= -20) {
            System.out.println("Холодно");
        } else {
            System.out.println("Тепло");
        }

    }
}
