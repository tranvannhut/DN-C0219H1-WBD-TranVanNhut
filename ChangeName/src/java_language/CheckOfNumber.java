package java_language;

import java.util.Scanner;
public class CheckOfNumber {
    public static void main(String[] args) {
        boolean b = false;
        Scanner numberOfPrimitive = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = numberOfPrimitive.nextInt();

        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                b = true;
                break;
            }
        }
        if (b == true) {
            System.out.println(number + "  is not a primitive number");
        } else {
            System.out.println(number + "  number is primitive number");
        }
    }
}



