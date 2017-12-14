package september;

import java.util.Scanner;
import static java.lang.Math.abs;

public class Taylor {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        double result = 1;
        double factorial = 1;
        double x = in.nextDouble();
        double xPow = x;
        double accuracy = in.nextDouble();
        double buff = accuracy + 1;
        for (int i = 1; abs(buff) > abs(accuracy); i++) {
            factorial *= i;
            buff = xPow/factorial;
            xPow *= x;
            result += buff;
        }
        System.out.println(result);
    }
}
