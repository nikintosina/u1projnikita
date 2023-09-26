import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total bill: ");
        float total = scanner.nextFloat();
        System.out.print("Enter the tip percentage: ");
        int tipPercent = scanner.nextInt();
        System.out.print("Enter the number of people: ");
        int nPeople = scanner.nextInt();

        TipCalculator tipCalculator = new TipCalculator(total, tipPercent, nPeople);

        System.out.printf("Total tip amount: $%.2f\n", tipCalculator.calculateTotalTip());
        System.out.printf("Total bill including tip: $%.2f\n", tipCalculator.calculateTotalBill());
        System.out.printf("Tip per person: $%.2f\n", tipCalculator.calculateTipPerPerson());
        System.out.printf("Total per person: $%.2f\n", tipCalculator.calculateTotalPerPerson());
    }
}
