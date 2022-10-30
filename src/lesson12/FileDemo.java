package lesson12;

import lesson12.service.FileService;
import lesson12.service.impl.FileServiceImpl;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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
