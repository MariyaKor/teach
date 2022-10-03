package lesson4;


import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int numb;
        if (sc.hasNextInt()) {
            numb = sc.nextInt();
            defineEntry(numb);
            deleteEntry(numb);
            defineMaxMinAv(numb);
            defineBiggerAverage();
            defineEvenElements(numb);
            replaceToZero();
            doSort();
            doBubbleSort();
        } else {
            System.out.println("Something went wrong, number should be integer...");
        }
        sc.close();
    }

    /**
     * 0. Создайте массив целых чисел. Напишете программу, которая выводит
     * сообщение о том, входит ли заданное число в массив или нет.
     * Пусть число для поиска задается с консоли (класс Scanner).
     */
    private static void defineEntry(int numb) {
        System.out.println("--------------------0.------------------");
        int[] a = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        String s1 = "Number isn't in the massive";
        for (int i = 0; i < 10; i++) {
            if (a[i] == numb) {
                s1 = "Number is in the massive";
                break;
            }
        }
        System.out.println(s1);
    }

    /**
     * 1. Создайте массив целых чисел. Удалите все вхождения заданного
     * числа из массива.
     * Пусть число задается с консоли (класс Scanner). Если такого числа нет -
     * выведите сообщения об этом.
     */
    private static void deleteEntry(Integer numb) {
        System.out.println("--------------------1.------------------");
        Integer[] a = {1, 3, 45, 7, 9, 17, 11, 113, 15, 17, 3, 33, 7, 719, 21};
        List<Integer> lst = new ArrayList<>(Arrays.asList(a));
        if (lst.contains(numb)) {
            lst.removeIf(elem -> elem.equals(numb));
            System.out.println("final a: " + Arrays.toString(lst.toArray()));
        } else {
            System.out.println("Number isn't in the massive");
        }
    }

    /**
     * 2. Создайте и заполните массив случайным числами и выведете
     * максимальное, минимальное и среднее значение.
     * Для генерации случайного числа используйте метод Math.random().
     * Пусть будет возможность создавать массив произвольного размера.
     * Пусть размер массива вводится с консоли.
     */
    private static void defineMaxMinAv(int size) {
        System.out.println("--------------------2.------------------");
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = Math.random();
        }
        System.out.println(Arrays.toString(array));
        double max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max:" + max);
        double min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min:" + min);
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        System.out.println("av:" + sum / size);

        //optional
        System.out.println("max with stream: " +Arrays.stream(array).max().getAsDouble());
        System.out.println("min with stream: " + Arrays.stream(array).min().getAsDouble());
        System.out.println("average with stream: " + Arrays.stream(array).average().getAsDouble());
    }

    /**
     * 3. Создайте 2 массива из 5 чисел.
     * Выведите массивы на консоль в двух отдельных строках.
     * Посчитайте среднее арифметическое элементов каждого массива и
     * сообщите, для какого из массивов это значение оказалось больше (либо
     * сообщите, что их средние арифметические равны).
     */
    private static void defineBiggerAverage() {
        System.out.println("--------------------3.------------------");
        int[] array1 = {1, 3, 5, 2, 78};
        int[] array2 = {3, 4, 6, 12, 8};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        double av1 = Arrays.stream(array1).average().getAsDouble();
        double av2 = Arrays.stream(array2).average().getAsDouble();
        if (av1 == av2) {
            System.out.println("Average equal");
        } else {
            String s1 = "Average of first array more than the second one";
            String s2 = "Average of second array more than the first one";
            String sentence = av1 > av2 ? s1 : s2;
            System.out.println(sentence);
        }
    }

    /**
     * 4. Создайте массив из n случайных целых чисел и выведите его на экран.
     * Размер массива пусть задается с консоли и размер массива может быть
     * больше 5 и меньше или равно 10.
     * Если n не удовлетворяет условию - выведите сообщение об этом.
     * Если пользователь ввёл не подходящее число, то программа должна
     * просить пользователя повторить ввод.
     * Создайте второй массив только из чётных элементов первого массива,
     * если они там есть, и вывести его на экран.
     */
    private static void defineEvenElements(int n) {
        System.out.println("--------------------4.------------------");
        if (!(n > 5 && n <= 10)) {
            System.out.println("Array size isn't correct, please try to enter once again");
        } else {
            int[] array1 = new int[n];
            for (int i = 0; i < n; i++) {
                array1[i] = new Random().nextInt();
            }
            System.out.println("array1: " + Arrays.toString(array1));
            List<Integer> lst = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (array1[i] % 2 == 0) {
                    lst.add(array1[i]);
                }
            }
            System.out.println("array2: " + Arrays.toString(lst.toArray()));
        }
    }

    /**
     * 5.Создайте массив и заполните массив.
     * Выведите массив на экран в строку.
     * Замените каждый элемент с нечётным индексом на ноль.
     * Снова выведете массив на экран на отдельной строке.
     */
    private static void replaceToZero() {
        System.out.println("--------------------5.------------------");
        int size = 7;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = new Random().nextInt();
        }
        System.out.print("array: " + Arrays.toString(array));
        for (int i = 0; i < size; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println("\narrayWithZeroes: " + Arrays.toString(array));
    }

    /**
     * 6.Создайте массив строк. Заполните его произвольными именами людей.
     * Отсортируйте массив.
     * Результат выведите на консоль.
     */
    private static void doSort() {
        System.out.println("--------------------7.------------------");
        String[] array = {"Янина", "Анна", "Екатерина", "Вероника", "Константин", "Антон"};
        Arrays.sort(array);
        System.out.println("Sorted names: " + Arrays.toString(array));
    }

    /**
     * 7.Реализуйте алгоритм сортировки пузырьком.
     */
    private static void doBubbleSort() {
        System.out.println("--------------------7.------------------");
        int[] array = {12, 1, 3, 5, 2, 0, 12, 87, 4, 100, 5};
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}





