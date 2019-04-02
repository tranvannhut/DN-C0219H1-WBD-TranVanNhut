package class_object;

import java.util.Scanner;

public class Phuongtrinhcanbachai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  parameter a = : ");
        int parameterA = input.nextInt();
        System.out.println(("Enter parameter b = "));
        int parameterB = input.nextInt();
        System.out.println("Enter parameter c = ");
        int parameterC = input.nextInt();
        QuadraticEquations obj = new QuadraticEquations(parameterA, parameterB, parameterC);
        System.out.println("Phuong trinh bac hai co tham so a : " + obj.parameterA + " tham so b = " + obj.parameterB + " tham so c :" + obj.parameterC);
        double delta = obj.getDelta();
        if (delta > 0) {
            System.out.println("phuong trinh co hai nghiem x1 =  " + obj.getRoot1() + " va x2 =  " + obj.getRoot2());
        } else if (delta == 0) {
            System.out.println("phuong trinh co mot nghiem duy nhat x = " + (-obj.parameterB / (2 * obj.parameterA)));
        } else {
            System.out.println("phuong tring vo nghiem");
        }
    }
}
