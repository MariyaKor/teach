package lesson14.service.impl;

import lesson14.service.ConsoleReaderService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConsoleReaderServiceImpl implements ConsoleReaderService {
    public LocalDate getDateFromConsole() {
        LocalDate localDate = null;
        try (Scanner sc = new Scanner(System.in)) {//чтобы выполнить sc.close() = finally
            System.out.println("Please enter date in dd-MM-yyyy format: ");
            if (sc.hasNextLine()) {
                String strDate = sc.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                localDate = LocalDate.parse(strDate, formatter);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return localDate;
    }

}
