public class MainClass {
    public static void main(String[] args) {
        Hdd hdd1 = new Hdd();
        hdd1.name = "WD Blue";
        hdd1.value = "1 Tb";
        hdd1.type = "Inner";
        Ram ram1 = new Ram();
        ram1.name = "Patriot";
        ram1.value = "8 Gb";
        Hdd hdd2 = new Hdd("Toshiba P300", "2 Tb", "Inner");
        Ram ram2 = new Ram("Hynix PC25600 DDR4", "16 Gb");

        Computer computer1 = new Computer(2000, "HP");
        computer1.hdd = hdd1;
        computer1.ram = ram1;
        Computer computer2 = new Computer(3800, "Asus", ram2, hdd2);

        System.out.println("Computer1:");
        computer1.showInformation();
        System.out.println();
        System.out.println("Computer2:");
        computer2.showInformation();
    }
}
