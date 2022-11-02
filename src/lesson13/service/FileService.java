package lesson13.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface FileService {

    Set<String> getStringsFromFiles(List<String> paths);

    void writeReportDataToFile(Map<String, String> reportMap);

}
