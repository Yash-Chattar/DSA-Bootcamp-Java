//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number: ");
        int num2 = sc.nextInt();
        
        if(num1 > num2){
            System.out.println(num1+" is greater than "+num2);
        }
        else if(num1 == num2){
            System.out.println("Both the Numbers are equal");
        }
        else{
            System.out.println(num2+" is greater than "+num1);
        }
    }
}
