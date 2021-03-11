/*
3) Куратор  для проверки одной работы (которая включается в себя N задач) за каждого студента берет
в качестве оплаты X$.
Каждую неделю студент получает новую работу, за каждую предыдущую несданную работу идет
коэффициент штрафов Z, который умножается каждую неделю: предыдущая сумма за тему на указанный процент
(т.е. если в первую неделю студент не сдал тему, то на след неделе стоимость проверки будет X * (1 + Z),
просрочка еще на неделю (X * (1 + Z)) * (1 + Z), и т.д.)
При этом каждую неделю нужно сдавать и новую тему, иначе и на эту тему тоже идет штраф.
1) Какую сумму куратор получит за студента,
если он
1)просрочит сдачу одной темы на T недель,
2)просрочит сдачу N из M тем на Y недель каждая,
3)не выполнит ни одной темы на T недель,
4) по каждой теме будет иметь просрочку на неделю/Q недель
2) Какую сумму куратор получит за всех студентов, если S студентов из общего количества студентов сделали просрочки,
остальные все вовремя сдавали
Разработать класс, калькулятор просрочек выполнения заданий куратора
Параметры настройки калькулятора должны иметь как минимум:
процент, на который стоимость часа куратора увеличивается с каждой неделей просрочки, количество недель курса,
количество студентов на занятии
Дополнительные параметры/функционал добавляются разработчиком самостоятельно
 */

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
    public double calculator1(int t){
        return (payment * (allweeks-1) + (payment*(Math.pow((1 + coefficient), t))));
    }
    /*просрочит сдачу N из M тем на Y недель каждая*/
    public double calculator2(int n, int m, int y){
        return (payment * (m-n)) + payment*n*Math.pow((1 + coefficient), y);
    }
    /*не выполнит ни одной темы на T недель*/
    public double calculator3(int t){
        double prosr= payment*(allweeks-t);
        for (int i = 1; i<=t; i++) {
            prosr += payment * Math.pow((1 + coefficient), i);
        }
        return prosr;
    }
    /*по каждой теме будет иметь просрочку на неделю/Q недель*/
    public double calculator4(int q){
        return allweeks*payment*(Math.pow((1 + coefficient), q));
    }
    /*Какую сумму куратор получит за всех студентов, если S студентов из общего количества студентов сделали просрочки,
    остальные все вовремя сдавали*/
    public double calculator5(int amount, int time, int q){
        return allweeks*payment*(students-amount)+payment*amount* ((allweeks-time)+q*(Math.pow((1 + coefficient), time)));
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
