package java_language;
import java.util.Scanner;
public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("enter a number a : ");
        int a = number.nextInt();
        System.out.println("enter number b : ");
        int b = number.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor ");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
            System.out.println("Greater common factor : " + a);
        }
    }
}

