package september;

import java.util.Scanner;

public class SinTab {
    public static void main (String []args) {
        Scanner in = new Scanner(System.in);
        System.out.println("f(x) = sin(x). Enter min, max and step:");
        double min = in.nextDouble();
        double max = in.nextDouble();
        double step = in.nextDouble();
        if (((min > max)&(step > 0)) || ((min < max) & (step < 0)) || (step == 0)) {
            System.out.println("Error!!!");
        } else {
            if (step > 0) {
                for (double x = min; x <= max; x += step) {
                    System.out.println("f(" + x + ") = " + Math.sin(x));
                }
            }
            else {
                for (double x = min; x >= max; x += step) {
                    System.out.println("f(" + x + ") = " + Math.sin(x));
                }
            }
        }
    }
}
