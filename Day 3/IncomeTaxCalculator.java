import java.util.*;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your annual income: ");
        double income = scanner.nextDouble();

        double tax = calculateTax(income);
        System.out.println("Your income tax is: ₹" + tax);

        scanner.close();
    }

    public static double calculateTax(double income) {
        double tax = 0;

        // Calculate tax based on income brackets
        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = (income - 250000) * 0.05;
        } else if (income <= 1000000) {
            tax = 12500 + (income - 500000) * 0.2;
        } else {
            tax = 112500 + (income - 1000000) * 0.3;
        }

        return tax;
    }
}