package lesson7.task2;

public class Main {

/**
 * 2. Создать классы "Директор", "Рабочий", "Бухгалтер".
 * Реализовать интерфейс с методом, который печатает название
 * должности и имплементировать этот метод в созданные классы.
 */

    public static void main (String[] args) {
        Worker perfectWorker = new Worker();
        Accountant perfectAccountant = new Accountant();
        Director perfectDirector = new Director();
        perfectWorker.printJobTitle();
        perfectAccountant.printJobTitle();
        perfectDirector.printJobTitle();
    }
}
