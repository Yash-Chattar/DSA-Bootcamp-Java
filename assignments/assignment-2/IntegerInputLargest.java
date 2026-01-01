import java.util.Scanner;

public class IntegerInputLargest {
    public static void main(String[] args) {
        int num = 1;
        int largest = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter numbers : ");
        while(true){
            num = sc.nextInt();
            if (num==0) {
                break;
            }
               
            if(largest < num){
                largest = num;
            }
        }
        System.out.println("The largest number is "+largest);
    }
}
