//Take integer inputs till the user enters 0 and print the sum of all numbers
//(HINT: while loop)

import java.util.Scanner;

public class IntegerInputTillZero {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter numbers : ");
        while(num !=0){
            num = sc.nextInt();   
            if(num != 0){
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
