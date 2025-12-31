//Input currency in rupees and output in USD.

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rupees: ");
        double Currency = sc.nextDouble();

        double USD = Currency*89.87;
        System.out.println(Currency+" Rupees IN USD IS $"+USD);
    }
}
