package class_object;
//import java.util.Scanner;
public class QuadraticEquations {
    public  int parameterA;
    public  int parameterB;
    public  int parameterC;
    //private double delta;
//    public QuadraticEquation(){
//        this.parameterA = parameterA;
//
//    }




    public QuadraticEquations(int parameterA, int parameterB, int parameterC){
        this.parameterA = parameterA;
        this.parameterB = parameterB;
        this.parameterC= parameterC;
    }
    public  int getDelta(){
       return ((this.parameterB*this.parameterB)-(4*this.parameterA*this.parameterC));
    }
    public  double getRoot1(){
        return  (-this.parameterB + Math.sqrt(this.getDelta()) / (2 * this.parameterA));

    }
    public double getRoot2(){
   return (-this.parameterB - Math.sqrt(this.getDelta()) / (2 * this.parameterA));
    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter  parameter a = : ");
//        int parameterA = input.nextInt();
//        System.out.println(("Enter parameter b = "));
//        int parameterB = input.nextInt();
//        System.out.println("Enter parameter c = ");
//        int parameterC = input.nextInt();
//        QuadraticEquations obj = new QuadraticEquations(parameterA,parameterB,parameterC);
//        System.out.println("Phuong trinh bac hai co tham so a : " + obj.parameterA + "tham so b = " + obj.parameterB + "tham so c :" +obj.parameterC );
//        double delta = obj.getDelta();
//        if(delta > 0){
//            System.out.println("phuong trinh co hai nghiem x1 = " + obj.getRoot1() + " va x2 = " + obj.getRoot2());
//        }else if (delta == 0 ){
//            System.out.println("phuong trinh co mot nghiem duy nhat x = " + (-obj.parameterB/(2*obj.parameterA)));
//        }else{
//            System.out.println("phuong tring vo nghiem");
//        }
  //  }
}