package september;

import java.util.Scanner;

public class Quadratic {
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a, b, c:");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = b*b - 4*a*c;
        if ((d < 0) || (a == 0)) {
            System.out.println("No roots or this equation isn't quadratic. Sad but true :c");
        }
        else {
            if (d == 0) {
                System.out.println("x = " + (-b / (2 * a)));
            } else {
                System.out.println("x1 = " + ((-b + Math.sqrt(d)) / (2 * a)));
                System.out.println("x2 = " + ((-b - Math.sqrt(d)) / (2 * a)));
            }
        }
    }
}
