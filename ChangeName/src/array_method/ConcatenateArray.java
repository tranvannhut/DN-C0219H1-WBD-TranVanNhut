package array_method;


import java.util.Scanner;
public class ConcatenateArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter size of array A : ");
        int sizeA = input.nextInt();
        int[] arrayA = new int[sizeA];
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(" arrayA[ " + i + " ] = ");
            arrayA[i] = input.nextInt();
        }
        showArray(arrayA);

        System.out.println("enter a size of array B : ");
        int sizeB = input.nextInt();
        int[] arrayB = new int[sizeB];
        for(int j = 0; j<arrayB.length; j++){
            System.out.print(" arrayB[ " + j + " ] =  ");
            arrayB[j] = input.nextInt();
        }
        showArray(arrayB);
        System.out.println("mang c : ");
        //int[] display =  additionalArray(arrayA, arrayB);
       // showArray(display);
        additionalArray(arrayA, arrayB);
    }
    public static void showArray(int[] array){
        for(int m =0 ; m< array.length; m++) System.out.print(array[m] + " ");
    }
    public static void additionalArray(int[] arrayA , int[] arrayB ) {
        int indexC = arrayA.length + arrayB.length;
        int[] arrayC = new int[indexC];
        for (int i = 0; i < arrayC.length; i++) {
            if (i < arrayA.length) {
                arrayC[i] = arrayA[i];
                System.out.print(arrayC[i] + "  ");
            } else {
                arrayC[i] = arrayB[i - arrayA.length];
                System.out.print( " " + arrayC[i] +  "  ");
            }
        }
    }

}
