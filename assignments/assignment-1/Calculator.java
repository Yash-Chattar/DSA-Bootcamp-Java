//Take in two numbers and an operator (+, -, *, /) and calculate the value.
//(Use if conditions)

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        double x = sc.nextDouble();
        System.out.print("Enter Second Number: ");
        double y = sc.nextDouble();

        System.out.print("Select Operator(Enter the digit): 1 = (+), 2 = (-), 3 = (/), 4 = (*) = ");
        int Operator = sc.nextInt();
        
        if(Operator == 1){
            double sum = x+y;
            System.out.println("Addition = "+ sum);
        }
        else if(Operator == 2){
            double subtraction = x-y;
            System.out.println("Subtraction: "+subtraction);
        }
        else if(Operator == 3){
            double divide = x/y;
            System.out.println("Division: "+divide);
        }
        else{
            double multiply = x*y;
            System.out.println("Multiplication: "+multiply);
        }
    }
}
