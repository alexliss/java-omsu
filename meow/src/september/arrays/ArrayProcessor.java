package september.arrays;

import java.util.Scanner;

public class ArrayProcessor {

    public static void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] scan() {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = in.nextInt();
        }
        return array;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int even(int[] array) {
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0) even++;
        }
        return even;
    }

    public static int belongingToAnInterval(int[] array, int a, int b) {
        int belonging = 0;
        int more = 0, less = 0;
        if (a <= b) {
            more = b;
            less = a;
        } else if (a > b) {
            more = a;
            less = b;
        }
        for (int i = 0; i < array.length; i++) {
            if ((array[i] >= less) && (array[i] <= more)) belonging++;
        }
        return belonging;
    }

    public static boolean isPositive(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) return false;
        }
        return true;
    }

    public static int[] reverse(int[] array) {
        int buff = 0;
        for (int i = 0; i < array.length/2; i++) {
            buff = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = buff;
        }
        return array;
    }

}
