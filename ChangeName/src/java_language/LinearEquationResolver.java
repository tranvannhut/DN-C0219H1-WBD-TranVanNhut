package java_language;

import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner parameter = new Scanner(System.in);
        System.out.println("enter number A : ");
        double a = parameter.nextDouble();
        System.out.println("enter number b :");
        double b = parameter.nextDouble();
        System.out.println("enter a number c :");
        double c = parameter.nextDouble();
        if(a != 0 ){
            double x = (c-b)/a;
            System.out.println(x);
        }else{
            if( b == 0 ){
                System.out.println("The solution is all x!");
            }else{
                System.out.println("No Solution!");
            }
        }
    }
}

