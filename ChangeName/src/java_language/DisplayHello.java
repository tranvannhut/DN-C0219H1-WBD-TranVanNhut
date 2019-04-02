package java_language;

import java.util.Scanner;
public class DisplayHello {
    public static void main(String[] args) {
        Scanner display = new Scanner(System.in);
        System.out.println("Enter yout name");
        String greeting = display.nextLine();
        System.out.println("Hello " + greeting);
    }
}

