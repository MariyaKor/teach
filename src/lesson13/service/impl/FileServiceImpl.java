package lesson13.service.impl;

import lesson13.service.FileService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FileServiceImpl implements FileService {

    public Set<String> getStringsFromFiles(List<String> inputPaths) {
        Set<String> docNumbers = new HashSet<>();
        inputPaths.forEach(inputPath -> {
            Path path = Paths.get(inputPath);//equals Path.of("C:\\Users\\HP\\Desktop\\TMS\\initialTestData.txt") since Java 11;
            try {
                docNumbers.addAll(Files.readAllLines(path));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        return docNumbers;
    }

    public void writeReportDataToFile(Map<String, String> reportMap) {
        Path path = Paths.get("C:\\Users\\HP\\IdeaProjects\\teach\\src\\lesson13\\resources\\finalReport.txt");
        try {
            Files.write(path, reportMap.entrySet().stream().map(k -> k.getKey() + "\r\n" + k.getValue()).collect(Collectors.toList()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
