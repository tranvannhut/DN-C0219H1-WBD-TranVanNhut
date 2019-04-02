package array_method;
import java.util.Scanner;
public class FindMaxValueOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter size of array :");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("enter index of array");
        int index = input.nextInt();
        for (int i = 0; i < array.length; i++) {
            System.out.print("array[ " + i + " ]  =  ");
            array[i] = input.nextInt();

        }
        System.out.println("the Element of array : " + sumArray(array));
        System.out.println("display of array : " );
        showArray(array);
        accessElement(array,index);

    }
    public static int sumArray( int[] array){
        int result = 0;
        for(int i = 0; i < array.length; i++ ){
           // System.out.print(array[i] + " ");
            result += array[i];
        }
        return result;
    }
    public static void showArray(int[] array ) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        }

    public static void  accessElement(int[] array ,int  index){
        //int result;
        System.out.println("access an element: ");
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[index]);
            break;
        }
        //System.out.println(array[index]);
        //return result;
    }
}