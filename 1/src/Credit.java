/*
1) Класс Credit
Создать класс кредита, который принимает следующую информацию: название кредита,
ставка, срок погашения, штрафные санкции есть или нет.
1) Создать массив объектов этого класса
2) Создать 2 конструктора, один принимает все аргументы, второй - 2 аргумента (на ваш выбор).
Один из конструкторов должен вызывать другой конструктор
3) Геттеры/сеттеры
4) создать метод для вывода информации на экран
*/

import java.sql.SQLOutput;

public class Credit {
    private String name;
    private double percent;
    private int maturity;
    private boolean sanctions;

    private Credit(double percent, boolean sanctions) {
        this.percent = percent;
        this.sanctions = sanctions;
    }
    public Credit(String name, double percent, int maturity, boolean sanctions) {
        this(percent,sanctions);
        this.name = name;
        this.maturity = maturity;
    }

    public String  getName() {
        return name;
    }
    public double getPercent() {
        return percent;
    }
    public int getMaturity() {
        return maturity;
    }
    public boolean getSanctions() {
        return sanctions;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPercent(double percent) {
        this.percent = percent;
    }
    private void setMaturity(int maturity) {
        this.maturity = maturity;
    }
    public void setSanctions(boolean sanctions) {
        this.sanctions = sanctions;
    }

    public void print() {
        System.out.println("Name  " + this.name);
        System.out.println("Percent  " + this.percent + "%");
        System.out.println("Maturity  " + this.maturity + " months");
        System.out.println("Sanctions  " + this.sanctions);
    }

    public static void main(String[] args) {
        Credit cr[] = new Credit[4];
        cr[0] = new Credit(1,true);
        cr[1] = new Credit("cr1",3.2,3,false);
        cr[2] = new Credit("cr2", 7.4,23,true);
        cr[3] = new Credit(23.4,true);
        cr[0].setName("cr0");
        cr[0].setMaturity(12);
        cr[3].setName("cr3");
        cr[3].setMaturity(72);
        cr[3].setPercent(15.5);
        cr[3].setSanctions(false);
        for (int i = 0; i < 3; i++){
            System.out.println("Credit №"+(i+1));
            cr[i].print();
        }
        System.out.println("Credit №4");
        System.out.println("Name  " + cr[3].getName());
        System.out.println("Percent  " + cr[3].getPercent() + "%");
        System.out.println("Maturity  " + cr[3].getMaturity() + " months");
        System.out.println("Sanctions  " + cr[3].getSanctions());
    }
}


