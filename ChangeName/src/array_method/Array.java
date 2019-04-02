package array_method;
import java.util.Scanner;
public class Array{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount rows to print : ");
        int x = input.nextInt();
        System.out.println(" Enter amount column to print : ");
        int y = input.nextInt();
        double[][] arr = new double[x][y];
        for (int m = 0; m < arr.length; m++) {
            for (int n = 0; n < arr[m].length; n++) {
                System.out.print(" arr [ " + m + " ]" + " [" + n + " ]  =  ");
                arr[m][n] = input.nextInt();
            }
        }

        System.out.println("Display an array just to declare : ");
        showOfArray(arr , x ,y);
        System.out.println("Enter a position of row : ");
        int k = input.nextInt();
        System.out.println("Enter a position of column");
        int l = input.nextInt();
        //System.out.println("The best Element of array : ");
        FindTheElement(arr, k, l);
    }
    private static void showOfArray(double[][] array, int x, int y) {
        for(int a = 0 ; a< array.length ; a++){
            for(int b = 0; b < array[a].length ; b++){
                System.out.println("arr [ " + a + " ]" + " [ " + b + "  ] = "  + array[a][b] + " ");
            }
        }
        }


        private static void FindTheElement(double[][] array, int x, int y){

            double max = array[0][0];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] > max) {
                        max = array[i][j];
                        x = i;
                        y = j;
                    }
                }
            }
            System.out.println("The best Element of Array : " + max + " in position " + x + " and " + y);

        }
        }


