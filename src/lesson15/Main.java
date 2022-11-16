package lesson15;

import java.util.List;
import java.util.stream.Collectors;


/**
 * Основное задание
 * 1. Создать коллекцию класса ArrayList наполнить ее элементами
 * рандомными элементами типа Integer.
 * С помощью Stream'ов:
 * - Удалить дубликаты
 * - Вывести все четные элементы в диапазоне от 7 до 17
 * (включительно)
 * - Каждый элемент умножить на 2
 * - Отсортировать и вывести на экран первых 4 элемента
 * - Вывести количество элементов в стриме
 * - Вывести среднее арифметическое всех чисел в стриме
 * Дополнительное задание
 * 2. Создать коллекцию класса ArrayList со значениями имен всех студентов
 * в группе
 * С помощью Stream'ов:
 * - Вернуть количество количество людей с вашим именем (вне
 * зависимости от верхнего/нижнего регистра букв)
 * - Выбрать все имена, начинающиеся на "а" (вне зависимости от
 * верхнего/нижнего регистра букв).
 */
public class Main {

    public static void main(String[] args) {

        final List<Integer> initialList = List.of(9, 1, 27, 3, 4, 5, 6, 7, 7, 8, 9, 10, 10, 11, 12, 13, 14, 15, 16, 17, 12, 56, 79, 9);
        System.out.println("initialList" + initialList);
        System.out.println("1. w/o duplicates: " + removeDuplicates(initialList));
        System.out.println("2. evenNumbers in range 7 to 17: " + getEvenNumbersInRange(initialList));
        System.out.println("3. multiplied numbers: " + getMultipliedNumbers(initialList));
        System.out.println("4. sorted list: " + getSortedNumbers(initialList));
        System.out.println("5. count of elements in the list: " + getCount(initialList));
        System.out.println("6. average of elements in the list: " + getAverage(initialList));
        final List<String> namesOfStudents = List.of("Mary", "Gabriel", "Bree", "Michael", "Susan", "Alex", "MARY", "anton", "mary");
        System.out.println("additional task list: " + namesOfStudents);
        final String myName = "Mary";
        System.out.println("7. getCountOfPeopleWithMyName: " + getCountOfPeopleWithMyName(namesOfStudents, myName));
        System.out.println("8. getNameStartedWithSpecifiedLetter: " + getNameStartedWithSpecifiedLetter(namesOfStudents));

    }

    private static List<Integer> removeDuplicates(List<Integer> initialList) {
        return initialList.stream().distinct().collect(Collectors.toList());
    }

    private static List<Integer> getEvenNumbersInRange(List<Integer> initialList) {
        return initialList.stream().filter(elem -> elem % 2 == 0 && (elem <= 17 && elem >= 7)).collect(Collectors.toList());
    }

    private static List<Integer> getMultipliedNumbers(List<Integer> initialList) {
        return initialList.stream().map(elem -> elem * 2).collect(Collectors.toList());
    }

    private static List<Integer> getSortedNumbers(List<Integer> initialList) {
        return initialList.stream().limit(4).sorted().collect(Collectors.toList());
    }

    private static long getCount(List<Integer> initialList) {
        return initialList.stream().count();
    }

    private static double getAverage(List<Integer> initialList) {
        return initialList.stream().mapToInt(elem -> elem).average().orElse(0);
    }

    private static long getCountOfPeopleWithMyName(final List<String> names, final String inputName) {
        return names.stream().filter(name -> name.equalsIgnoreCase(inputName)).count();
    }

    private static List<String> getNameStartedWithSpecifiedLetter(List<String> namesOfStudents) {
        return namesOfStudents.stream()
                .filter(name -> name.startsWith("a") || name.startsWith("A"))
                .collect(Collectors.toList());
    }
}
