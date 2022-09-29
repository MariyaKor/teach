package lesson3;

import java.util.Scanner;

/**
 * 1. Написать программу для вывода названия поры года по номеру
 * месяца.
 * При решении используйте оператор switch-case.
 */
public class SeasonUtil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numberOfMonth :");
        int numberOfMonth;
        if (sc.hasNextInt()) {
            numberOfMonth = sc.nextInt();
            defineSeason(numberOfMonth);
        } else {
            System.out.println("Something went wrong, numberOfMonth should be integer...");
        }
        sc.close();
    }

    public static void defineSeason(final int numberOfMonth) {
        switch (numberOfMonth) {
            case 1, 2, 12 -> System.out.println("winter");
            case 3, 4, 5 -> System.out.println("spring");
            case 6, 7, 8 -> System.out.println("summer");
            case 9, 10, 11 -> System.out.println("fall");
            default -> System.out.println("Incorrect numberOfMonth");
        }
    }
}
