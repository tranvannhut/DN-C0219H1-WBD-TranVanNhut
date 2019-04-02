package java_language;

import java.util.Scanner;
public class Rectangle1 {
  public static void main(String[] args){
      float width;
      float height;
      Scanner rectangle = new Scanner(System.in);
      System.out.println("enter the width : ");
      width = rectangle.nextFloat();
      System.out.println("enter the height:");
      height = rectangle.nextFloat();
      float result = width * height ;
      System.out.println(result);
  }
}

