package array_method;
import java.util.Scanner;
public class AddElementOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("create a size of array:");
        int size = input.nextInt();
        int[] arr;
        arr = new int[size];
        System.out.println("Nhap phan tu cua mang : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " " );
        }

        int[] result = insertElementArray(arr,1,300);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }


    }

    public static int[] insertElementArray(int[] arr, int index, int X) {
        int[] array = new int[arr.length + 1];
        if (index < 0 || index > arr.length) {
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            if (i < index) {
                array[i] = arr[i];
            }
            if(i == index ){
                array[i] = X;
            }
            if (i > index) {
                array[i] = arr[i - 1];
            }
        }
        return array;
    }
}

