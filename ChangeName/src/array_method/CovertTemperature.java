package array_method;
import java.util.Scanner;
public class CovertTemperature {
   public static double celsiusToFahrenheit(double c) {
       double fahrenheit = (c * 9 / 5) + 32;
       return fahrenheit;
   }
   public static double fahrenheitToCelsius(double f){
       double celsius = (f - 32)*5/9;
       return celsius;
    }
    public static void main(String[] args){

       Scanner input = new Scanner(System.in);
       int choice;
       double fahrenheit;
       double celsius;
       do {
            System.out.println("Menu :  ");
            System.out.println("1. Convert celsius to fahrenheit : ");
            System.out.println("2. Convert fahrenheit to celsius : ");
            System.out.println("0. Exit ");
            System.out.println("Enter your choise :");
            choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter Celsius : ");
                    celsius = input.nextDouble();
                    double convert = celsiusToFahrenheit(celsius);
                    System.out.println("Fahrenheit to convert : " + convert + " fahrenheit");
                    break;
                case 2:
                    System.out.println("enter Fahrenheit :");
                    fahrenheit = input.nextDouble();
                    double pass = fahrenheitToCelsius(fahrenheit);
                    System.out.println("Celsius to c " + pass + " degree");
                    break;
                case 0:
                    System.exit(0);
            }
        }while(choice != 0);

    }


}
