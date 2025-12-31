//To find Armstrong Number between two given number.

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int ans = armstrongnum(num);
        System.out.println(ans);

        if(ans == 1){
            System.out.println("It is an armstrong number");
        }
        else{
            System.out.println("It is not an armstrong number");
        }
    }

    static int armstrongnum(int num){
        int original = num;
        int armstrong = 0;
        while (num != 0){
            int cube = num%10;
            armstrong = armstrong + cube*cube*cube;
            num = num/10;
        }
        if(armstrong == original){
            return 1;
        }
        else{
            return -1;
        }
    }
}
