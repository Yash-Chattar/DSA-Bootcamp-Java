//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class FibonacciSeries2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        Fibonacci(num);
    }
    
    static void Fibonacci(int num){
        int a = 0;
        int b = 1;
        for(int i = 0; i < num; i++){
            int c = a + b;
            System.out.println(a);
            a=b;
            b=c;
        }
    }         
}

