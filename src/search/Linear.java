package search;

import javax.sound.sampled.Line;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Linear {
    public static int generateRandomNumber() {
        return (int) (Math.random()*10) + 10;
    }

    public static void printArray(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.println("|" + i + "|" + a[i] + "|");
        }
    }

    public static int getValueByIndes(int[] a, int index) {
        if (index < a.length) return a[index];
        return 0;
    }

    public static boolean arrayContainsValue(int[] a, int value) {
        boolean contains = false;

        for(int i = 0; i < a.length; i++) {
            if(a[i] == value) contains = true;
        }

        return contains;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Linear.generateRandomNumber();
        }

        Linear.printArray(arr);
        System.out.println(Linear.getValueByIndes(arr, 12));
        System.out.println("Array contains value 12: " + Linear.arrayContainsValue(arr, 12));
    }
}
