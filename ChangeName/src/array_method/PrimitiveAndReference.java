package array_method;

public class PrimitiveAndReference {
    public static void main(String[] args) {
         int a = 3;
        int  b = 6;
        swap(3, 6);
        System.out.println((a +" and " + b));


    }
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b= temp;
        System.out.println(a + " and " + b);
    }
}

