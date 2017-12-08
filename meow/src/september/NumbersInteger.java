package september;

import java.util.Scanner;

public class NumbersInteger {
    public static void main (String []args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        double n = (num1 + num2 + num3)/3.0;
        System.out.println((num1 * num2 * num3) + " " + n);
        if (num1 <= num2) { // .1.2.
            if (num1 <= num3) {
                if (num2 <= num3) {
                    System.out.println(num1 + " " + num2 + " " + num3); //123
                }
                else {
                    System.out.println(num1 + " " + num3 + " " + num2); //132
                }
            }
            else {
                System.out.println(num3 + " " + num1 + " " + num2); // 312
            }
        }
        else { // .2.1.
            if (num3 <= num2) // 321
            {
                System.out.println(num3 + " " + num2 + " " + num1); // 321
            }
            else {
                if (num3 <= num1) {
                    System.out.println(num2 + " " + num3 + " " + num1); // 231
                }
                else {
                    System.out.println(num2 + " " + num1 + " " + num3); // 213
                }
            }
        }
    }
}

