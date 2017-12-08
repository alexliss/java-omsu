package september;

import java.util.Scanner;

public class Numbers {
    public static void main (String []args) {
        Scanner in = new Scanner(System.in);
        float num1 = in.nextFloat();
        float num2 = in.nextFloat();
        float num3 = in.nextFloat();
        System.out.println((num1 * num2 * num3) + " " + (num1 + num2 + num3)/3);
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
