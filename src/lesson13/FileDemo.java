package lesson13;

import lesson13.service.FileService;
import lesson13.service.impl.FileServiceImpl;
import lesson13.service.ConsoleReaderService;
import lesson13.service.impl.ConsoleReaderServiceImpl;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
