package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        if (sc.hasNextInt()) {
            int numb = sc.nextInt();
            task1(numb);
            task2();
            task3();
            task4();
        } else {
            System.out.println("Something went wrong, number should be integer...");
        }
        sc.close();
    }

    /**
     * 1.Создать трехмерный массив из целых чисел.
     * С помощью циклов "пройти" по всему массиву и увеличить каждый
     * элемент на заданное число. Пусть число, на которое будет
     * увеличиваться каждый элемент, задается из консоли.
     */
    private static void task1(int numb) {
        int[][][] array = {{{1, 2, 3}, {10, 20, 20}}, {{50, 60, 70}}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = array[i][j][k] + numb;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }

    /**
     * 2. Шахматная доска
     * Создать программу для раскраски шахматной доски с помощью цикла.
     * Создать двумерный массив String'ов 8х8. С помощью циклов задать
     * элементам циклам значения B(Black) или W(White). Результат работы
     * программы:
     * W B W B W B W B
     * B W B W B W B W
     * W B W B W B W B
     * B W B W B W B W
     * W B W B W B W B
     * B W B W B W B W
     * W B W B W B W B
     * B W B W B W B W
     */
    private static void task2() {
        System.out.println("task2:");
        String[][] array = new String[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = "W";
                } else {
                    array[i][j] = "B";
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }


    /**
     * 3. Создайте двумерный массив целых чисел. Выведите на консоль сумму
     * всех элементов массива.
     */
    private static void task3() {
        System.out.println("task3:");
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += array[i][j];
                System.out.print("\t" + array[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("sum:" + sum);

    }

    /**
     * 4. Создайте двумерный массив целых чисел. Отсортируйте элементы в
     * строках двумерного массива по возрастанию.
     */
    private static void task4() {
        System.out.print("task4:");
        int[][] array = {{2, 1, 3, 8}, {5, 6, 4, 7,}, {7, 9, 8, 10}};
        for (int i = 0; i < 3; i++) {
                Arrays.sort(array[i]);
        }
        System.out.println(Arrays.deepToString(array));
    }
}
