package lesson12.service;

import java.util.List;

public interface FileService {

    List<String> getStringsFromFile();

    void writeValidStringsToFile(List<String> finalLst);

    void writeNotValidStringsToFile(List<String> finalLst);

}
