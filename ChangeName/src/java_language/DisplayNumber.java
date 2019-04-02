package java_language;
import java.util.Scanner;
public class DisplayNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number a : ");
        int number = input.nextInt();
        String result = "";
        //boolean isPrimeNumber(n) = true;
        for (int n = 2; n < number; n++) {
            if (isPrimeNumber(n)) {
                result += (n + " ");
            }
        }
            System.out.println("Day cac so nho hon 100 la : " + result);
        }
    public static boolean isPrimeNumber(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    }




