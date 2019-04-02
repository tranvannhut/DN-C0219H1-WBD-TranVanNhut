package java_language;

import java.util.Scanner;
public class DateOfMonth {
    public static void main(String[] args) {

        Scanner month = new Scanner(System.in);
        System.out.println("enter a number : ");
        int count = month.nextInt();
        switch (count){
            case 1:
            case 3:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println( "Thang  " +  count + " " + "la thang co 31 ngay");
                break;
            case 2:
                System.out.println("Thang 2 co 28 hoac 29 ngay" );
                break;
            default:
                System.out.println("Thang  " + count + " la thang co 30 ngay");
        }

    }
}
