package java_language;

//import java.util.Scanner{
 public class Rectangle {
     float width;
     float height;
     public  void widthOfRectangle(float width) {
         this.width = width;
     }
     public  void heightOfRectangle(float height){
         this.height = height;
     }
     public void squareOfRectangle(){
          System.out.println(this.width * this.height);
     }

     public static void main (String[] args) {
         Rectangle rectangle = new Rectangle();
         rectangle.widthOfRectangle(34);
         System.out.println(rectangle.width);
         rectangle.heightOfRectangle(4);

         System.out.println(rectangle.height);
         rectangle.squareOfRectangle();
       //  System.out.println(rectangle.squareOfRectangle(30 , 5);

     }
     }



