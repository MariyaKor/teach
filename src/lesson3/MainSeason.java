package lesson3;

import java.util.Scanner;

/**
 * 1. Написать программу для вывода названия поры года по номеру
 * месяца.
 * При решении используйте оператор switch-case.
 * 2. Написать программу для вывода названия поры года по номеру
 * месяца.При решении используйте оператор if-else-if.
 */
public class MainSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numberOfMonth :");
        int numberOfMonth;
        if (sc.hasNextInt()) {
            numberOfMonth = sc.nextInt();
            SeasonUtils.defineSeasonSwitchCase(numberOfMonth);
            SeasonUtils.defineSeasonIfElse(numberOfMonth);
        } else {
            System.out.println("Something went wrong, numberOfMonth should be integer...");
        }
        sc.close();
    }
}
