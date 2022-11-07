package lesson14;

import lesson14.service.ConsoleReaderService;
import lesson14.service.CustomService;
import lesson14.service.impl.ConsoleReaderServiceImpl;

/**
 * Основное задание
 * 1. Написать программу для вывода на консоль названия дня недели по
 * введенной дате.
 * 2. Написать программу для вывода на экран дату следующего вторника.
 * Дополнительное задание
 * 3. Создать обобщенный функциональный интерфейс.
 * Написать класс с одним методом.
 * В этом методе реализуйте логику:
 * - если в консоль введена цифра 1, то: использования интерфейса со
 * строковым типом и передать в метод интерфейса логику реверса
 * строки(вывода строки в обратном порядке)..
 */
public class Main {
    public static void main(String[] args) {
        ConsoleReaderService reader = new ConsoleReaderServiceImpl();
        String dayOfTheWeek = DateUtils.getDayOfTheWeek(reader.getDateFromConsole());
        System.out.println("dayOfTheWeek: " + dayOfTheWeek);
        System.out.println("nextTuesday " + DateUtils.getNextTuesday());
        final StringBuilder str = new StringBuilder("I'll become a good programmer!");
        System.out.println(getReversedString(1, str));
    }

    private static StringBuilder getReversedString(final int applyReverse, final StringBuilder str) {
        if (applyReverse == 1) {
            CustomService<StringBuilder> service = in -> str.reverse();
            return service.reverse(str);
        }
        return new StringBuilder("Reverse not allowed");
    }
}
