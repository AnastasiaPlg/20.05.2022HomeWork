public class CreditCard {
    String accountNumber;
    double currentSum;

    CreditCard(String accountNumber, double currentSum) {
        this.currentSum = currentSum;
        this.accountNumber = accountNumber;
    }
    public void addMoney(double money) {
        this.currentSum = currentSum + money;
    }
    public void withdrawMoney(double money) {
        this.currentSum = currentSum - money;
    }
    public void showBalance() {
        System.out.println(this.currentSum);
    }
}
