package array_method;

import java.util.Scanner;

public class MinValueOfArray {
    public static void minValueOfArray(int[] arr) {
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        System.out.println("The minimum value of Array " + min + "in position " + index);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter size of array :");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Display an array : ");
        for (int j = 0; j < array.length; j++) {
            array[j] = input.nextInt();
        }
        minValueOfArray(array);
    }
}

