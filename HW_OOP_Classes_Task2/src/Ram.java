public class Ram {
    String name;
    String value;

    public Ram() {
    }

    public Ram(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public void showInformation() {
        System.out.println("RAM:\nName: " + name + ";\nValue: " + value);
    }
}
