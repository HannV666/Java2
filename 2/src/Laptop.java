public class Laptop {
    private String macAddress;
    private String model;
    private double weight;
    private String processorType;
    private String os;

    private Laptop(String macAddress, String model, String os){
        this.macAddress = macAddress;
        this.model = model;
        this.os = os;
    }
    private Laptop(double weight, String processorType){
        this.weight = weight;
        this.processorType = processorType;
    }
    private Laptop() {
    }
    public String getMacAddress() {
        return macAddress;
    }
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getProcessorType() {
        return processorType;
    }
    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }

    public void showNotePad(String name){
        System.out.println("Content of" + name + "filename");
    }
    public void showNotePad(String name, int amount){
        System.out.println("Content of" + name + "filename");
        System.out.println(amount);
    }
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop("00:37:59:00:6f:62", "Lenovo","Microsoft Windows");
        Laptop l3 = new Laptop(2.32,"AMD" );

        l1.setMacAddress("00:26:57:00:1f:02");
        l2.setMacAddress("00:95:32:00:4f:07");
        l3.setMacAddress("00:84:05:00:3f:10");

        l1.setModel("Apple");
        l2.setModel("HP");
        l3.setModel("ASUS");

        l1.setWeight(3.53);
        l2.setWeight(2.5);
        l3.setWeight(3.3);

        l1.setProcessorType("Intel");
        l2.setProcessorType("AMD");
        l3.setProcessorType("Intel");

        l1.setOs("Linux");
        l2.setOs("Microsoft Windows");
        l3.setOs("UNIX");

        System.out.println("MacAddress  " + l1.getMacAddress());
        System.out.println("Model  " + l1.getModel());
        System.out.println("Weight  " + l1.getWeight());
        System.out.println("ProcessorType  " + l1.getProcessorType());
        System.out.println("OS  " + l1.getOs());

        System.out.println("MacAddress  " + l2.getMacAddress());
        System.out.println("Model  " + l2.getModel());
        System.out.println("Weight  " + l2.getWeight());
        System.out.println("ProcessorType  " + l2.getProcessorType());
        System.out.println("OS  " + l2.getOs());

        System.out.println("MacAddress  " + l3.getMacAddress());
        System.out.println("Model  " + l3.getModel());
        System.out.println("Weight  " + l3.getWeight());
        System.out.println("ProcessorType  " + l3.getProcessorType());
        System.out.println("OS  " + l3.getOs());

        l1.showNotePad("name1");
        l1.showNotePad("name2", 122);
    }
}
