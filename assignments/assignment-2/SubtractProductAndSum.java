import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Difference: "+subtract(num));
    }
    static int subtract(int num){
    int product = 1;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            product *= digit;
            sum += digit;
            num /= 10;
        }

        return product - sum;
    }
}


