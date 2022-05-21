public class Hdd {
    String name;
    String value;
    String type;

    public Hdd() {
    }

    public Hdd(String name, String value, String type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public void showInformation() {
        System.out.println("HDD:\nName: " + name + ";\nValue: " + value + ";\nType: " + type);
    }

}
