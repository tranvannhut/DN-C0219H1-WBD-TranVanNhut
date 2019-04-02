package java_language;
import java.util.Scanner;
public class CountPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the amout prime number to print :");
        int number = input.nextInt();
        int count = 0;
        String result = " ";
        for(int n = 2 ; count < number ; n++){
            if(isPrimeNumber(n)){
                count++ ;
                result += (n + " ");
            }

        }

        System.out.println("Day so gom " + number + " so nguyen : " +  result);
    }
    public static boolean isPrimeNumber(int n){
        for (int i = 2; i < n ; i++){
            if(n % i == 0){
                return  false;
            }
        }
        return true;
    }

}
