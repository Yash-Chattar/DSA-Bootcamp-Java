//Write a program to input principal, time, and rate (P, T, R) from the user and
//find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        double P = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double R = sc.nextDouble();
        System.out.print("Enter Time: ");
        int T = sc.nextInt();

        double SI = P*R*T/100;
        System.out.println("Simple Interest is: "+SI);
    }
}
