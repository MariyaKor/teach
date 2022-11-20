package lesson17;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Основное задание
 * 1. Написать программу для проверки на валидность введенного ip адреса.
 * Пусть ip адрес задается с консоли.
 * Программа должна проверять валидность введенного ip адреса с
 * помощью регулярного выражения и выводить результат проверки на
 * экран.
 * Дополнительное задание
 * 2. Программа на вход получает путь к папке (задается через консоль).
 * В заданной папке находятся текстовые файлы (формат тхт).
 * Каждый файл содержит произвольный текст. В этом тексте может быть
 * номер документа(один или несколько), емейл и номер телефона.
 * номер документа в формате: xxxx-yyy-xxxx-yyy-xyxy, где x - это
 * любая цифра, а y - это любая буква русского или латинского алфавита
 * номер телефона в формате: +(ХХ)ХХХХХХХ
 * Документ может содержать не всю информацию, т.е. например, может не
 * содержать номер телефона, или другое поле.
 * Необходимо извлечь информацию из N текстовых документов. Число
 * документов для обработки N задается с консоли.
 * Если в папке содержится меньше документов, чем заданное число -
 * следует обрабатывать все документы.
 * Извлеченную информацию необходимо сохранить в следующую
 * структуру данных:
 * Map<String, Document>, где
 * ключ типа String - это имя документа без расширения,
 * значение типа Document - объект кастомного класса, поля которого
 * содержат извлеченную из текстового документа информацию
 * Учесть вывод сообщений на случаи если,
 * - на вход передан путь к папке, в которой нет файлов
 * - все файлы имеют неподходящий формат (следует обрабатывать
 * только тхт файлы)
 * - так же сообщения на случай других исключительных ситуаций
 * TeachMeSkills.by
 * В конце работы программы следует вывести сообщение о том, сколько
 * документов обработано и сколько было документов невалидного
 * формата.
 */

public class RegularExpressionsDemo {
    public static void main(String[] args) {
        final String IPADDRESS_PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        runRegex(getIPAddressFromConsole(), IPADDRESS_PATTERN);
    }

    private static String getIPAddressFromConsole() {
        String testIpAddress = "";
        try (Scanner sc = new Scanner(System.in)) {//чтобы выполнить sc.close() = finally
            System.out.println("Please enter IP address: ");
            if (sc.hasNextLine()) {
                testIpAddress = sc.nextLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return testIpAddress;
    }

    public static void runRegex(String textData, final String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(textData);
        if (matcher.find()) {
            System.out.println("IP address " + textData + " is valid");
        } else {
            System.out.println("IP address " + textData + " isn't valid");
        }

    }
}