package lesson6;

public class CreditCard {
    private final String accountNumber;
    private double currentSum;

    public CreditCard(String accountNumber, double currentSum) {
        this.accountNumber = accountNumber;
        this.currentSum = currentSum;
    }

    public void topUpCardBalance(double amount) {
        this.currentSum += amount;
    }

    public void withdrawFromTheCardBalance(double amount) {
        this.currentSum -= amount;
    }

    @Override
    public String toString() {
        return "CreditCard " + "{accountNumber= " + this.accountNumber + ", "+ "currentSum=" + this.currentSum +"}" ;
    }
}