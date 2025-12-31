//Write a program to print whether a number is even or odd, also take
//input from the user.

import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        
        if (x%2==0){
            System.out.println(x+" is an even number");
        }else{
            System.out.println(x+" is an odd number");
        }
    }
}