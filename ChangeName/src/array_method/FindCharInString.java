package array_method;

import java.util.Scanner;

public class FindCharInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String  string = input.nextLine();
        System.out.println("This string is " + string);
        System.out.println("Enter a char ");
        char letter = input.next().charAt(0);
        System.out.println(letter);
        findChar(string, letter);
    }
   private static void findChar(String string,char character){
        int count = 0;
        for(int i = 0; i< string.length(); i++){
            if(string.charAt(i) == character){
                 count++;
            }
        }
       System.out.println("The number appear of element in String : " + count);
   }
}
