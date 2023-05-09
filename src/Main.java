import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your monthly salary:");
        double monthlySalary = scanner.nextDouble();
        double savingsPercentage = 0.3;
        double monthlySavings = monthlySalary * savingsPercentage;
        double annualSavings = monthlySavings * 12;
        System.out.println("Your annual savings is:" + annualSavings);
    }
}