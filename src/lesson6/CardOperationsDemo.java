package lesson6;

/**
 * This class is meant to do operations with credit cards.
 * Тестовый сценарий для проверки:
 * Положите деньги на первые две карточки и снимите с третьей.
 * Выведите на экран текущее состояние всех трех карточек.
 */
public class CardOperationsDemo {
    public static void main(String[] args) {
        System.out.println("task1:");
        CreditCard firstCardToTopUp = new CreditCard("BY20 OLMP 3135 0000 0010 0000 0933", 10000);
        CreditCard secondCardToTopUp = new CreditCard("BY20 OLMP 3135 0000 0010 0000 0934", 20000);
        CreditCard cardToWithdraw = new CreditCard("BY20 OLMP 3135 0000 0010 0000 0935", 30800);
        firstCardToTopUp.topUpCardBalance(300);
        secondCardToTopUp.topUpCardBalance(500);
        cardToWithdraw.withdrawFromTheCardBalance(600);
        System.out.println(firstCardToTopUp);
        System.out.println(secondCardToTopUp);
        System.out.println(cardToWithdraw);

    }
}
