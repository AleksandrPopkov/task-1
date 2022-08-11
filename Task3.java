import java.util.Scanner;

public class Task4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("write the number of the hour hand: ");
        int hours = in.nextInt();
        System.out.print("write the number of the minute hand: ");
        int minutes = in.nextInt();
        in.close();
        
        inAngle(hours, minutes);
    }
    
    public static void inAngle(int hh, int mm) { 
  int angle = (360-((hh + mm / 60) * 30 - 6 * mm));       
  System.out.println("angle between arrows" + angle);
    }
    
}
