package lesson13.service.impl;

import lesson13.service.ConsoleReaderService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleReaderServiceImpl implements ConsoleReaderService {

    public List<String> getPathsFromConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter full paths of files,to finish enter 0:");
        List<String> paths = new ArrayList<>();
        final String ZERO = "0";
        if (sc.hasNextLine()) {
            while (!sc.nextLine().equals(ZERO)) {
                paths.add(sc.nextLine());
            }
        }
        sc.close();
        return paths;
    }
}
