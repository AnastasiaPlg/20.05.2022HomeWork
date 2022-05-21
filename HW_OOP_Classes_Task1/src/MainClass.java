public class MainClass {
    public static void main(String[] args) {
        CreditCard npcBank = new CreditCard("B132U795", 320.65);
        CreditCard qazBank = new CreditCard("R232T981", 1328.21);
        CreditCard pivBank = new CreditCard("M692R267", 948.54);

        npcBank.addMoney(200);
        qazBank.addMoney(150);
        pivBank.withdrawMoney(250);

        System.out.print("npcBank: ");
        npcBank.showBalance();
        System.out.print("qazBank: ");
        qazBank.showBalance();
        System.out.print("pivBank: ");
        pivBank.showBalance();
    }
}
