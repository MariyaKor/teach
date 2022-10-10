package lesson6;

/**
 * Дополнительное задание
 * Тестовый сценарий для проверки:
 * создать объект "компьютер 1" с помощью первого конструктора и
 * вывести информацию на экран;
 * создать объект "компьютер 2" с помощью второго конструктора и
 * вывести информацию на экран.
 */
public class ComputerDemo {

    public static void main(String[] args) {
        System.out.println("-------additional task------");
        Computer pc1 = new Computer(50000, "ASUS");
        System.out.println(pc1);
        Computer pc2 = new Computer(80000, "HP", new HDD("SSD", 32, "external"), new RAM("DRAM", 16));
        System.out.println(pc2);
    }
}
