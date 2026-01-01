import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of fibonacci series: ");
        int num = sc.nextInt();

        fibonacci2(num);
    }

    static void fibonacci2(int num){
        int a = 0;
        int b = 1;
        for(int i = 0; i < num; i++){
            int c = a + b;
            System.out.print(a+" ");
            a=b;
            b=c;
        }
    }
}