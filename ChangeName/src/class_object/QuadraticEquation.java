package class_object;
// Không cần khởi tạo đối tượng  từ class QuadraticEquation khi sử dụng từ khóa "thís"
//
// import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number a :");
        int parameterA = input.nextInt();
        System.out.println("Enter a number b : ");
        int parameterB = input.nextInt();
        System.out.println("Enter a number c : ");
        int parameterC = input.nextInt();
       // QuadraticEquation object = new QuadraticEquation(int A, int parameterB, int parameterC);
        double  delta = getDiscriminant(parameterA,parameterB,parameterC);
        getRoot1(parameterB,parameterA,delta);

    }
    private  static double getDiscriminant(int a, int b , int c){
        int result;
        result = (b*b) - (4*a*c);
        return result;
    }
    private static void  getRoot1(int b , int a, double delta){
        double x1;
        double x2;
        int  x;
        if(delta > 0){
            x1 = ((-b+ Math.sqrt(delta))/(2*a));
            x2 = ((-b- Math.sqrt(delta))/(2*a));
            System.out.print("Phương trình có nghiệm thứ nhất x1 =   " + x1 + " ");
            System.out.println("và có nghiệm thứ hai x2 =  " + x2);
        }else if(delta == 0){
            x=((-b)/(2*a));
            System.out.println("Phương trình có một nghiệm duy nhất là  x = " + x);
        }else{
            System.out.println("Phương trình vô nghiệm");
        }
    }

}
