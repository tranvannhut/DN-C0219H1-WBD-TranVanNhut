package java_language;

import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number  a :");
        int a = number.nextInt();
        System.out.println("Enter number b : ");
        int b = number.nextInt();
        System.out.println("Enter number c :");
        int c = number.nextInt();
        double delta = (b*b) - (4*a*c);
        if(a == 0 ){
            if(b != 0){
                int result = -(c/b);
                System.out.println("Phương trình có một nghiệm :  " + result);
            }//end condition b != 0;
        }else{
            if(delta > 0 ){
             double x1 = (-b + Math.sqrt(delta)/ (2*a));
             double x2 = (-b - Math.sqrt(delta) / (2*a));
                System.out.println("Phương trình có hai nghiêm là : ");
                System.out.println(x1);
                System.out.println(x2);
            }else if(delta == 0 ){
             double x = -(b/(2*a));
                System.out.println("Phương trình có một nghiệm : ");
                System.out.println(x);
            }else{
                System.out.println("Phương trình vô nghiệm");
            }
        }

    }
}
