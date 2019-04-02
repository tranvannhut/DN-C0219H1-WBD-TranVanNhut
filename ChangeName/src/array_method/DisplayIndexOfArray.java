package array_method;

import java.util.Scanner;

public class DisplayIndexOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = {"Nhut", "Thanh", "Trung", "Dao", "Kien"};
        System.out.println("enter a name who you want to find :");
        String name = input.nextLine();

        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i])) {
                System.out.println(name + " can tim  o vi tri " + i);
                break;
            }
        }
    }// end of method main
// end of class DisplayIndextOfArray
}