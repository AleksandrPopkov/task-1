import java.util.Scanner;

public class Task4 {
//    Напишите метод, который будет вычислять угол между часовой и минутной стрелками часов.
//    На вход функции подаётся время в виде двух переменных: "hours" и "minutes"
//    Расчет угла производить относительно реального поведения стрелок часов.

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("write the number of the hour hand: ");
        int hours = in.nextInt();
 	if (hours > 12) {
            System.out.println("please enter value in 12 hour format)");
           in.next();
    }
        System.out.print("write the number of the minute hand: ");
        int minutes = in.nextInt();
	if (minutes > 60) {
            System.out.println("there are less than 60 minutes in an hour, please enter another value)");
            in.next();
    }
        in.close();
        
        inAngle(hours, minutes);
    }
    
    public static void inAngle(int hh, int mm) { 
    var angle = (hh * 30 + mm * 0.5) - (mm * 6);
    double maxAngle = Math.abs(360 - angle);
        
  System.out.println("angle between arrows " + angle + "°");
    }
    
}
