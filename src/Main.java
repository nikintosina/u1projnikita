import java.nio.channels.FileLock;
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
        float totalTip = total * tipPercent / 100;
        float totalBill = total + totalTip;
        float tipPerPerson = totalTip / nPeople;
        float totalPerPerson = totalBill / nPeople;

        System.out.printf("Total tip amount: $%.2f\n", totalTip);
        System.out.printf("Total bill including tip: $%.2f\n", totalBill);
        System.out.printf("Tip per person: $%.2f\n", tipPerPerson);
        System.out.printf("Total per person: $%.2f\n", totalPerPerson);
    }
}