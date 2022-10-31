package lesson12.service.impl;

import lesson12.service.FileService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileServiceImpl implements FileService {

    public List<String> getStringsFromFile() {
        List<String> lst;
        Path path = Paths.get("C:\\Users\\HP\\IdeaProjects\\teach\\src\\lesson12\\resources\\initialTestData.txt");//equals Path.of("C:\\Users\\HP\\Desktop\\TMS\\initialTestData.txt");
        try {
            lst = new ArrayList<>(Files.readAllLines(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return lst;
    }

    public void writeValidStringsToFile(List<String> finalLst) {
        Path path = Paths.get("C:\\Users\\HP\\IdeaProjects\\teach\\src\\lesson12\\resources\\validDocNumbers.txt");
        try {
            Files.write(path, finalLst);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeNotValidStringsToFile(List<String> finalLst) {
        Path path = Paths.get("C:\\Users\\HP\\IdeaProjects\\teach\\src\\lesson12\\resources\\notValidNumbers.txt");
        try {
            Files.write(path, finalLst);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
