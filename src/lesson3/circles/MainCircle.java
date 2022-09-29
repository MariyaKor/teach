package lesson3.circles;

public class MainCircle {
    public static void main(String[] args) {
        printOddNumbers();
        printNumbers();
    }

    /**
     * 1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
     * При решении используйте операцию инкремента (++).
     */
    private static void printOddNumbers() {
        System.out.println("--------------------1.------------------");
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * 2. Необходимо вывести на экран числа от 5 до 1.
     * При решении используйте операцию декремента (--).
     */
    private static void printNumbers() {
        System.out.println("--------------------2.------------------");
        for (int i = 5; i > 0; i--) {
            System.out.println(i);

        }
    }


}
