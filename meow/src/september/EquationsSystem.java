package september;

import java.util.Scanner;

public class EquationsSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("You have 2 equations like \n ax + by = c \n dx + ey = f");
        System.out.println("Enter a, b, c, d, e, f:");
  /*      double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        double e = in.nextDouble();
        double f = in.nextDouble();*/
        System.out.println();
        SLE(0, 0, 0, 0, 0, 0);
        System.out.println();
        SLE(0, 0, 1, 0, 0, 1);
        SLE(0, 0, 0, 0, 0, 1);
        SLE(0, 0, 1, 0, 0, 0);
        SLE(1, 1, 1, 2, 2, 1);
        SLE(1, 0, 10, 1, 0, 3);
        SLE(0, 1, 10, 0, 1, 5);
        System.out.println();
        SLE(0, 0, 0, 1, 2, 3);
        SLE(1, 1, 2, 2, 2, 4);
        SLE(1, 0, 0, 0, 0, 0);
        SLE(0, 1, 0, 0, 0, 0);
        SLE(1, 1, 0, 0, 0, 0);
        System.out.println();
        SLE(1, 2, 3, 4, 5, 6);
    }

    public static void SLE(double a, double b, double c, double d, double e, double f) {
        double delta, deltaX, deltaY;
        delta = a * e - b * d;
        deltaX = c * e - b * f;
        deltaY = a * f - c * d;
        if (delta != 0) {
            System.out.println("x = " + deltaX / delta);
            System.out.println("y = " + deltaY / delta);
        } else {
            if ((a == 0) && (b == 0) && (c == 0) && (d == 0) && (e == 0) && (f == 0)) {
                System.out.println("x = y = R");
                return;
            }
            if ((a == 0) && (b == 0) && (c != 0) || (d == 0) && (e == 0) && (f != 0)) {
                System.out.println("No solutions");
                return;
            }
            if ((a == 0) && (b == 0) && (d != 0) && (e != 0)) {
                System.out.println("y = (-" + d + "x + " + f + ")/" + e);
                return;
            }
            if ((a != 0) && (b != 0) && (d == 0) && (e == 0)) {
                System.out.println("y = (-" + a + "x + " + c + ")/" + b);
                return;
            }
            if ((a * f == c * d) && (b * f == c * e)) {
                if (b != 0) {
                    System.out.println("y = (-" + a + "x + " + c + ")/" + b);
                    return;
                }
                if (e != 0) {
                    System.out.println("y = (-" + d + "x + " + f + ")/" + e);
                    return;
                }
                if (a != 0) {
                    System.out.println("х = (-" + b + "y + " + c + ")/" + a);
                    return;
                }
                if (d != 0) {
                    System.out.println("х = (-" + e + "y + " + f + ")/" + d);
                    return;
                }
            }
            System.out.println("No solutions");
        }
    }
}
