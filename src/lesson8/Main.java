package lesson8;

public class Main {

    public static void main(String[] args) {
        Phone phoneOfMichael = new Phone("+375447676633", "Samsung", 165);
        Phone phoneOfMonica = new Phone("+375447676233", "iPhone", 190);
        Phone phoneOfAlex = new Phone("+375447676289", "Xiaomi", 170);
        System.out.println(phoneOfMichael);
        System.out.println(phoneOfMonica);
        System.out.println(phoneOfAlex);
        phoneOfMichael.receiveCall("Mom");
        phoneOfMonica.receiveCall("Dad");
        phoneOfAlex.receiveCall("Kate");
        System.out.println(phoneOfMichael.getNumber());
        System.out.println(phoneOfMonica.getNumber());
        System.out.println(phoneOfAlex.getNumber());
        phoneOfMichael.receiveCall("Mom","+375447678923");
        phoneOfMonica.receiveCall("Dad", "+375447678933");
        phoneOfAlex.receiveCall("Kate", "+375447678935");
        phoneOfMichael.sendMessage("+375296564433");
        phoneOfMonica.sendMessage("+375296564433","+375296564432","+375296564439");
        phoneOfAlex.sendMessage("+375296564433","+375336564432");

    }
}
