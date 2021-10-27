package december;

public class Solution {
    public static void main(String[] args) {
        hackSalary(700);        //зарплата
    }

    public static void hackSalary(int salary) {
        salary = salary + 100;
        System.out.println("Твоя зарплата составляет: " + salary + " долларов в месяц.");
    }
}
