public class MainClass {
    public static void main(String[] args) {
        CashMachine atm = new CashMachine(500, 370, 215);
        atm.addCash(20, 5);
        atm.withdrawCash(7, 3, 8);
        System.out.println(atm.countAmountOfCash());
        atm.showInfoAboutCash();
        atm.withdrawCash(250);
        atm.showInfoAboutCash();
    }
}
