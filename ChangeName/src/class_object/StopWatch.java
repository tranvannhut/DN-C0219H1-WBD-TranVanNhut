package class_object;

//import sun.awt.geom.AreaOp;
import java.lang.InterruptedException;
public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }
    public long getStartTime(){
        return this.startTime;
    }
    public long getEndTime(){
        return this.endTime;
    }
    public long start(){
        return this.startTime;
    }
    public long end(){
        return this.endTime = System.currentTimeMillis();
    }

    public static void main(String[] args) throws InterruptedException {
        StopWatch time = new StopWatch();
        System.out.println("First of Time is : "  + time.getStartTime());
        Thread.sleep(10000);
        System.out.println("End of time : " + time.end());
        System.out.println(time.end() - time.start());
    }

}