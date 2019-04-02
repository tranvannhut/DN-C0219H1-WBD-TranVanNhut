package array_method;

import java.util.Scanner;

public class ArrayOfMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of multiplication array : ");
        System.out.println("enter size row :");
        int sizeRow = input.nextInt();
        System.out.println("Enter size column :");
        int sizeColumn = input.nextInt();
        int[][] array = new int[sizeRow][sizeColumn];
        for(int i = 0; i < array.length; i++){
            for(int j= 0; j< array.length; j++){
                System.out.print(" array [ " + i + " ] "+ " [ " + j  + " ] = ");
                array[i][j]  = input.nextInt();
            }
        }
        System.out.println("Display the multiplication array  : " );
        showOfArray(array);
        System.out.println("The sum of element at the main diagonal : " + sumOfArray(array));
        System.out.println("Enter column to sum of array : ");
        int column = input.nextInt();
        System.out.println("The sum of element of  column =  " + sumOfColumn(array,column));
    }
    private static void showOfArray(int[][] array){
        for(int i= 0; i<array.length; i++){
            for(int j = 0; j<array.length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }//end of method showOfArray();
    private static int sumOfArray(int[][] arrayA ){
        int result = 0;
        for(int k = 0; k < arrayA.length; k++) {
            for (int l = 0; l < arrayA.length; l++) {
                if (k == l) {
                    result += arrayA[k][l];
                }
            }
        }
            return result;
        }
        private static int sumOfColumn(int[][] array, int column){
        int sum = 0;
           for(int m = 0; m < array.length; m++){
            for(int n= 0; n < array.length; n++){
                if(m == column){
                    sum += array[m][column];
                }
            }
            //break;
        }
            return sum;
        }
}

