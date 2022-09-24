package lesson2;

import java.util.Scanner;

/**
 * This class is meant to enter user name from keypad.
 */
public class HelloUser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя пользователя <User> :");
        String user = sc.nextLine();
        System.out.println("Hello <User> " + user + "!");
        sc.close();
    }

}
