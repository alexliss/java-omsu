package september.arrays;

import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        int[] array = ArrayProcessor.scan();
        ArrayProcessor.print(array);
        System.out.println("sum = " + ArrayProcessor.sum(array));
        System.out.println("even = " + ArrayProcessor.even(array));
        if(ArrayProcessor.isPositive(array)) { System.out.println("Positive"); }
        else { System.out.println("Negative"); }
        array = ArrayProcessor.reverse(array);
        ArrayProcessor.print(array);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(ArrayProcessor.belongingToAnInterval(array, a, b));
    }
}
