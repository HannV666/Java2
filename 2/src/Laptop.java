/*
2) Класс Laptop.
1) Создайте класс Laptop, который содержит переменные MacAddress, Model, Weight, ProcessorType, OS. ******#####
2) Создайте 3 объекта этого класса. *******#########
3) Выведите на консоль характерестики.
4) Добавить в класс Laptop методы: showNotePad(), имеет один параметр – имя файла. Выводит на консоль сообщение
 “Content of {name} file”. Создать геттеры и сеттеры для каждого поля. Вызвать эти методы для каждого из объектов.
5) Добавить конструктор в класс Laptop, который принимает на вход три параметра для инициализации переменных класса -
macAdress, model и os. ************##########
6) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса -
weight, processorType. ****************#############
7) Добавить конструктор без параметров. *************##############
8) Добавьте перегруженный метод showNotePad(), который принимает два параметра - имя файла и
количество строк кода в нем. Вызвать этот метод.*/

public class Laptop {
    private int macAddress;
    private String model;
    private double weight;
    private String processorType;
    private String os;

    private Laptop(int macAddress, String model, String os){
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
    public int getMacAddress() {
        return macAddress;
    }
    public void setMacAddress(int macAddress) {
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
        Laptop l2 = new Laptop(1, "qwe","lkcml");
        Laptop l3 = new Laptop(32.32,"wjc" );

        l1.setMacAddress(1);
        l2.setMacAddress(2);
        l3.setMacAddress(3);

        l1.setModel("l1");
        l2.setModel("l2");
        l3.setModel("l3");

        l1.setWeight(32.53);
        l2.setWeight(2.5);
        l3.setWeight(3.3);

        l1.setProcessorType("1-1");
        l2.setProcessorType("2-2");
        l3.setProcessorType("3-3");

        l1.setOs("w1");
        l2.setOs("w2");
        l3.setOs("w3");

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
