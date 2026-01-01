//Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            int remainder = num%i;
            if(remainder==0){
                System.out.print(i+" ");
            }
        }
    }
}
