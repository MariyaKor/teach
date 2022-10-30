package lesson10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringUtils {

    /**
     * 1.Вывести на экран в одну строку два первых блока по 4 цифры.
     * @param str = "9999-abc-1678-ABC-2a3b";
     */
    public static void showOnlyNumbers(final String str) {
        System.out.println("Два блока по 4 цифры: " + str.substring(0, 4) + " " + str.substring(9, 13));
    }

    /**
     * 2.Вывести на экран номер документа, но блоки из трех букв заменить
     * на *** (каждая буква заменятся на *)
     * @param str = "9999-abc-1678-ABC-2a3b";
     */
    public static void replace(final String str) {
        String[] mas = str.split("-");
        System.out.println("Замена: " + str.replace(mas[1], "***").replace(mas[3], "***"));
    }

    /**
     * 3.Вывести на экран только одни буквы из номера документа в формате
     * yyy/yyy/y/y в нижнем регистре.
     * @param str = "9999-abc-1678-ABC-2a3b";
     */
    public static void getStringInNewFormat(final String str) {
        String[] mas = str.toLowerCase().split("-");
        System.out.println("Новый формат: " + mas[1] + "/" + mas[3] + "/" + mas[4].charAt(1) + "/" + mas[4].charAt(3));
    }

    /**
     * 4.Вывести на экран буквы из номера документа в формате
     * "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
     * @param str = "9999-abc-1678-ABC-2a3b";
     */
    public static void getStringInUpperCase(final String str) {
        StringBuilder initialStr = new StringBuilder(str.toUpperCase().replace("-", "/"));
        System.out.println("Letters: " + initialStr.delete(0, 5).delete(4, 9).delete(8, 9).deleteCharAt(9).insert(9, "/"));
    }

    /**
     * 5.Проверить содержит ли номер документа последовательность abc и
     * вывети сообщение содержит или нет(причем, abc и ABC считается
     * одинаковой последовательностью).
     * @param str = "9999-abc-1678-ABC-2a3b";
     */
    public static void isContains(final String str) {
        String message = "Not contains";
        if (str.contains("abc") || str.contains("ABC")) {
            message = "Contains";
        }
        System.out.println(message);
    }

    /**
     * 6. Проверить начинается ли номер документа с последовательности 9999.
     * @param str = "9999-abc-1678-ABC-2a3b";
     */
    public static void startsWithSubsequence(final String str) {
        System.out.println(str.startsWith("9999"));
    }

    /**
     * 7.Проверить заканчивается ли номер документа на последовательность 1a2b.
     * @param str = "9999-abc-1678-ABC-2a3b";
     */
    public static void endsWithSubsequence(final String str) {
        System.out.println(str.endsWith("1a2b"));
    }

    /**
     * 1.Дана строка произвольной длины с произвольными словами.
     * Найти самое короткое слово в строке и вывести его на экран.
     * Найти самое длинное слово в строке и вывести его на экран.
     * Если таких слов несколько, то вывести последнее из них.
     * @param str = "I like programming on JAVA and Scala";
     */
    public static void additionalTaskPrintWords(final String str) {
        List<String> lstOfWords = Arrays.asList(str.toLowerCase().split(" "));
        System.out.println("Shortest word: " + lstOfWords.stream().min(Comparator.comparing(String::length)).get());
        System.out.println("Longest word: " + lstOfWords.stream().max(Comparator.comparing(String::length)).get());
    }


    /**
     * 2.Дана произвольная строка.
     * Вывести на консоль новую строку, которой задублирована каждая буква из
     * начальной строки.
     * Например, "Hello" -> "HHeelllloo"
     * @param str = "I like programming on JAVA and Scala";
     */
    public static void additionalTaskDuplicatedLetters(final String str) {
        String[] words = str.split(" ");
        StringBuilder finalString = new StringBuilder();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                finalString.append(word.charAt(i)).append(word.charAt(i));
            }
        }
        System.out.println(finalString);
    }

}
