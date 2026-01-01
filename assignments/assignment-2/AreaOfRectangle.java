import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter the width of rectangle: ");
        double w = sc.nextDouble();

        //area of rectangle = A = l*w

        double area = l*w;
        System.out.println("area of the rectangle is: "+area);
    }
}
