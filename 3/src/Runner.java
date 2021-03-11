public class Runner {
    private double payment;
    private double coefficient;
    private int allweeks;
    private int students;

    public Runner (double payment, double coefficient, int allweeks, int students){
        this.payment = payment;
        this.coefficient = coefficient;
        this.allweeks = allweeks;
        this.students = students;
    }
    /*просрочит сдачу одной темы на T недель*/
    public double calculator1(int time){
        return (payment * (allweeks-1) + (payment*(Math.pow((1 + coefficient), time))));
    }
    /*просрочит сдачу N из M тем на Y недель каждая*/
    public double calculator2(int n, int m, int time){
        return (payment * (m-n)) + payment*n*Math.pow((1 + coefficient), time);
    }
    /*не выполнит ни одной темы на T недель*/
    public double calculator3(int time){
        double prosr= payment*(allweeks-time);
        for (int i = 1; i<=time; i++) {
            prosr += payment * Math.pow((1 + coefficient), i);
        }
        return prosr;
    }
    /*по каждой теме будет иметь просрочку на неделю/Q недель*/
    public double calculator4(int time){
        return allweeks*payment*(Math.pow((1 + coefficient), time));
    }
    /*Какую сумму куратор получит за всех студентов, если S студентов из общего количества студентов сделали просрочки,
    остальные все вовремя сдавали*/
    public double calculator5(int amount, int time, int tasks){
        return allweeks*payment*(students-amount)+payment*amount* ((allweeks-time)+tasks*(Math.pow((1 + coefficient), time)));
    }
    public static void main(String[] args) {
        Runner salary = new Runner(10, 0.05, 5, 10);
        System.out.println("Salary: task 1-1: " + salary.calculator1(5));
        System.out.println("Salary: task 1-2: " + salary.calculator2(4,5,3));
        System.out.println("Salary: task 1-3: " + salary.calculator3(5));
        System.out.println("Salary: task 1-4: " + salary.calculator4(5));
        System.out.println("Salary: task 2: " + salary.calculator5(9, 4, 5));
    }
}
