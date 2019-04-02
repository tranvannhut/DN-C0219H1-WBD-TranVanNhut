package array_method;
import java.util.Scanner;
public class FindStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;


        do {
            System.out.println("enter the size of array :");
             size = input.nextInt();
            if (size > 30)
                System.out.println("size should not exceed 30 ");
        } while (size > 30);
       // System.out.println("enter points of students : ");
        int[] point = new int[size];
        for (int i = 0; i < point.length; i++) {
            System.out.print("Enter mark for students " + (i + 1) +  " : ");
            point[i] = input.nextInt();
        }
        showPoint(point);
    }
    private static void showPoint(int[] point){
        int count = 0 ;
        for(int i = 0; i <point.length; i++){
            System.out.print(point[i] + " ");

            if(point[i] > 5 && point[i] < 10) {
                //count = point[i];
                count++;
            }
            }
            System.out.println("the number of student pass the examination " + count);
        }
    }




