package lesson3.circles;

import java.util.Scanner;

public class CirclesUtils {
    /**
     * 1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
     * При решении используйте операцию инкремента (++).
     */
    public static void task1() {
        System.out.println("--------------------1.------------------");
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * 2. Необходимо вывести на экран числа от 5 до 1.
     * При решении используйте операцию декремента (--).
     */
    public static void task2() {
        System.out.println("\n--------------------2.------------------");
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    /**
     * 3. Напишите программу, где пользователь вводит любое целое
     * положительное число. А программа суммирует все числа от 1 до
     * введенного пользователем числа.
     * Для ввода числа воспользуйтесь классом Scanner.
     */
    public static void task3() {
        System.out.println("\n--------------------3.------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive integer:");
        if (sc.hasNextInt()) {
            int finalNum = sc.nextInt();
            int sum = 0;
            for (int i = 1; i < finalNum; i++) {
                sum += i;
            }
            System.out.print("sum: " + sum);
        } else {
            System.out.println("Something went wrong, integer expected...");
        }
        sc.close();
    }

    /**
     * 4. Необходимо, чтоб программа выводила на экран вот такую
     * последовательность:
     * 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
     * В решении используйте цикл while.
     */
    public static void task4() {
        System.out.println("\n--------------------4.------------------");
        int i = 0;
        while (i < 98) {
            i += 7;
            System.out.print(i + " ");
        }
    }

    /**
     * 5. Вывести 10 первых чисел последовательности 0, -5,-10,-15..
     */
    public static void task5() {
        System.out.println("\n--------------------5.------------------");
        int num = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print(num + "," + " ");
            num -= 5;
        }
    }


    /**
     * 6. Составьте программу, выводящую на экран квадраты чисел от 10 до 20
     * включительно.
     */
    public static void task6() {
        System.out.println("\n--------------------5.------------------");
        int k;
        for (int i = 10; i < 20; i++) {
            k = (int) Math.pow(i, 2);
            System.out.print(k + " ");
        }
    }

    /**
     * Выведите на экран первые 11 членов последовательности Фибоначчи.
     * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
     */
    public static void taskAdditional1() {
        int n0 = 0;
        int n1 = 1;
        int n2;
        System.out.println("\n----------------- taskAdditional1 -----------------");
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i <= 11; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
    }

    /**
     * Напишите программу, которая выводит на консоль таблицу умножения
     */
    public static void taskAdditional2() {
        System.out.println("\n--------------- taskAdditional2 ---------------");
        for (int i = 1; i < 11; i++) {
            System.out.print("\n");
            for (int j = 1; j < 11; j++) {
                System.out.print("   \t");
                int p = i * j;
                System.out.println(i + " * " + j + " = " + p);
            }
        }
    }
}
