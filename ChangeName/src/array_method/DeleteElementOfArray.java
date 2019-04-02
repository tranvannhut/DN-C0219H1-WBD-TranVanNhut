package array_method;
import java.util.Scanner;
public class DeleteElementOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int sizeArray = input.nextInt();
        System.out.println("Initialize array : ");
        int[] array = new int[sizeArray];
        System.out.println("Enter an element into array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" array [ " + i + " ] =  ");
            array[i] = input.nextInt();
        }
        show(array);
        System.out.println( "\n" + "Enter an element to delete : ");
        int elementX = input.nextInt();
        System.out.println("Find the index element  of array to delete is ");
         int index = findIndexOfArray(array,elementX);
        System.out.print("Position to delete: " + index + " \n" );
        System.out.println("Display new Array : ");
        displayOfArray(array, index);
    }

   private static void show(int[] array) {

       for (int i1 : array) System.out.print(i1 + " " );
   }
       private static int findIndexOfArray(int[] array, int elementX){
        int index_del = 0;
           for(int j = 0; j< array.length; j++){
               if(array[j] == elementX){
                   index_del = j;
               }
           }
           return index_del;
       }
       private static void displayOfArray(int[] arr, int index){
        int[] newOfArray = new int[arr.length];
        for(int j = 0; j < arr.length -1 ; j++)
            if (j < index) {
                newOfArray[j] = arr[j];
                System.out.print(newOfArray[j] + "  ");
            } else {
                newOfArray[j] = arr[j + 1];
                System.out.print(newOfArray[j] + " ");
            }
       }

    }

