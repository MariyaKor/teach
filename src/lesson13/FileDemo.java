package lesson13;

import lesson13.service.FileService;
import lesson13.service.impl.FileServiceImpl;
import lesson13.service.ConsoleReaderService;
import lesson13.service.impl.ConsoleReaderServiceImpl;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 2. Основное задание
 * 1. Вернемся к домашнему заданию занятия номер 12 и модифицируем его.
 * Программа должна получать имена файлов с номерами документов с
 * консоли: каждая новая строка - это путь к файлу и имя файла.
 * Для завершения ввода списка файлов следует ввести 0.
 * После получения списка документов программа должна обработать
 * каждый документ: вычитать из файла номера документов и
 * провалидировать их.
 * В конце работы создать один файл отчет с выходной информаций: номер
 * документа - комментарий(валиден или не валиден и по какой причине).
 * Пусть каждый файл содержит каждый номер документа с новой строки и
 * в строке никакой другой информации, только номер документа.
 * Валидный номер документа должен иметь длину 15 символов и
 * начинаться с последовательности docnum(далее любая
 * последовательность букв/цифр) или kontract(далее любая
 * последовательность букв/цифр).
 * Учесть, что номера документов могут повторяться в пределах одного
 * файла и так же разные документы могут содержать одни и те же номера
 * документов.
 * Если номера документов повторяются, то повторные номера документов
 * не проверять, не валидировать.
 * Немного технических деталей
 * 1) Считать с консоли список документов: раз список - то это коллекции
 * типа List, никаких других условий нет - значит все имена файлов с
 * консоли сохраняем в структуру данных ArrayList.
 * 2) Номера документов могут повторяться, но повторные документы
 * обрабатывать не надо и валидировать не надо,т.е. по сути дубликаты
 * нам не нужны - значит, надо считать номера документов из файлов и все
 * номера документов сохранять в коллекцию типа Set. Других условий нет,
 * значит можно использовать HashSet.
 * 3) В конце должна быть структура номер документа - комментарий - т.е.
 * эта структура типа ключ-значений,значит это коллекция типа Map.
 * Других условий нет - значит, можно использовать HashMap. Создать
 * такую структуру и уже потом сделать цикл по этой структуре и записать
 * всю информацию из этой мапы в файл-отчет.
 */

public class FileDemo {

    public static void main(String[] args) {
        ConsoleReaderService readerService = new ConsoleReaderServiceImpl();
        FileService service = new FileServiceImpl();
        Set<String> initialSet = service.getStringsFromFiles(readerService.getPathsFromConsole());
        System.out.println("initialSet: " + initialSet);
        Map<String, String> dataForReport = getDataForReport(initialSet);
        System.out.println("dataForReport: " + dataForReport);
        service.writeReportDataToFile(dataForReport);
    }

    private static Map<String, String> getDataForReport(Set<String> setOfDocNumbers) {
        final int MAX_LENGTH = 15;
        Map<String, String> reportMap = new HashMap<>();
        setOfDocNumbers.forEach(docNumber -> {
            if (docNumber.length() != MAX_LENGTH) {
                reportMap.put(docNumber, " Non valid: document number doesn't equal 15");
            } else if (!(docNumber.startsWith("docnum") || docNumber.startsWith("contract"))) {
                reportMap.put(docNumber, " Non valid: document number doesn't start with docnum or contract");
            } else if (docNumber.contains(" ")) {
                reportMap.put(docNumber, " Non valid: document number has space");
            } else {
                reportMap.put(docNumber, " Valid ☺");
            }
        });
        return reportMap;
    }

}
