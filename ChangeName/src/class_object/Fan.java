package class_object;

public class Fan {
    public int slow = 1;
    public int medium = 2;
    public int fast = 3;
    private int speed = slow;
    public boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(){
    }
  //  public Fan(int speed, boolean on, double radius, String color){



    public int getSpeed() {
        return this.speed;
    }
    public int setSpeed(int speed) {
        return this.speed = speed;
    }
    public boolean ison(){
        return this.on;
    }
    public boolean  setStatus(boolean status){
      if(status == true){
          return this.on = true ;
      }else{
          return this.on;
      }
    }

    //public boolean
    public double getRadius(){
        return this.radius;
    }
    public double setRadius(double radius){
        return this.radius = radius;
    }
    public String getColor(){
        return this.color;
    }
    public String setColor(String color){
        return this.color = color;
    }
    public String toString(){
        if(this.on){
            return "Speed : " + this.getSpeed() + " and color : " + this.getColor()+ " , radius : "+  this.getRadius() + " " + " , fan is on";
        }else{
            return "Speed : " + this.getSpeed()+ " and color " +  this.getColor()+ " , radius "+  this.getRadius()+ " " + " ,fan is off ";
        }
    }

    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println("Information of fan contain of  " + fan.toString());
        Fan fan1 = new Fan();
       // System.out.println(fan1.toString());
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setStatus(true);
        System.out.println("Information of fan1 contain of  " + fan1.toString());
        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setStatus(false);
        System.out.println("information of fan2 contain of  " + fan2.toString());
    }

}
