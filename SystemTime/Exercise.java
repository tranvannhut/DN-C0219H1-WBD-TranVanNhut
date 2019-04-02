public class Exercise{
    int x;
    public Exercise(int y){
        x = y;
    }
    public static void main (String[] args){
        Exercise number = new Exercise(10){}
        System.out.println(number.x);
    }
}