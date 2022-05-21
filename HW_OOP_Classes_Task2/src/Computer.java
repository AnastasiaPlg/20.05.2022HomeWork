public class Computer {
    double coast;
    String model;
    Ram ram;
    Hdd hdd;

    public Computer(double coast, String model) {
        this.coast = coast;
        this.model = model;
    }
    public Computer(double coast, String model, Ram ram, Hdd hdd) {
        this.coast = coast;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void showInformation() {
        System.out.println("Coast: " + coast + ";\nModel: " + model);
        ram.showInformation();
        hdd.showInformation();
    }

}
