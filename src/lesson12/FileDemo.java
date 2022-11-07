package lesson12;

import lesson12.service.FileService;
import lesson12.service.impl.FileServiceImpl;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Основное задание
 * 1. Допустим есть txt файл с номерами документов.
 * Номером документа является строка, состоящая из букв и цифр(без
 * служебных символов).
 * Пусть этот файл содержит каждый номер документа с новой строки и в
 * строке никакой другой информации, только номер документа.
 * Валидный номер документа должен иметь длину 15 символов и
 * начинаться с последовательности docnum(далее любая
 * последовательность букв/цифр) или contract(далее любая
 * последовательность букв/цифр).
 * Написать программу для чтения информации из входного файла - путь к
 * входному файлу должен задаваться через консоль.
 * Дополнительное задание
 * 2. Улучшить предыдущее задание. А именно:
 * Валидные номера документов следует записать в один файл-отчет.
 * Невалидные номера документов следует записать в другой файл-отчет,
 * но после номеров документов следует добавить информацию о том,
 * почему этот документ невалиден.
 */
public class FileDemo {

    public static void main(String[] args) {
        FileService service = new FileServiceImpl();
        List<String> initialList = service.getStringsFromFile();
        System.out.println("initialList: " + initialList);
        List<String> validDocNumbers = getValidDocNumbers(initialList);
        System.out.println("validDocNumbers: " + validDocNumbers);
        List<String> notValidDocNumbers = getNotValidDocNumbers(initialList);
        System.out.println("notValidDocNumbers: " + notValidDocNumbers);
        service.writeValidStringsToFile(validDocNumbers);
        service.writeNotValidStringsToFile(notValidDocNumbers);

    }

    private static Predicate<String> getPredicate() {
        final int MAX_LENGTH = 15;
        return str -> str.length() == MAX_LENGTH
                && (str.startsWith("docnum") || str.startsWith("contract"))
                && !Pattern.matches("\\p{Punct}", str)
                && !str.contains(" ");
    }

    private static List<String> getValidDocNumbers(List<String> lst) {
        return lst.stream().filter(getPredicate()).collect(Collectors.toList());
    }

    private static List<String> getNotValidDocNumbers(List<String> lst) {
        return lst.stream().filter(str -> !getPredicate().test(str)).collect(Collectors.toList());
    }

}
