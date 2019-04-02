package java_language;
import java.util.Scanner;
public class CovertMoney {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a usd : ");
       int usd = input.nextInt();
       int vnd = 23000/usd;
       System.out.println("convert to vnd : " + vnd);
   }
}
