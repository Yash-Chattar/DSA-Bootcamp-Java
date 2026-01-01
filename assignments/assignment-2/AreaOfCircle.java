//Area Of Circle Java Program

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of circle: ");
        double r = sc.nextDouble();
        double pi = Math.PI;

        // to calculate area
        double area = Math.PI * (r * r);
        System.out.println(area + " is the area of circle.");
    }
}
// Added this comment for today's practice
