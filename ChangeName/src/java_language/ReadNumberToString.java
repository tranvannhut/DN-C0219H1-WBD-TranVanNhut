package java_language;

import java.util.Scanner;
public class ReadNumberToString {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("enter a number : ");
        int N = number.nextInt();
        int a,b,c;

        switch (c = N % 10){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
        }

        switch(b = (N%100/10)){
            case 2:
                System.out.println("twenty");
                break;
            case 3:
                System.out.println("Thirty");
                break;
        }

        switch(a = N / 100){
            case 1:
                System.out.println("One hundred");
                break;
            case 2:
                System.out.println("Two hundred");
                break;
        }
        System.out.println(a + " " + b  + " " + c);
    }

}
