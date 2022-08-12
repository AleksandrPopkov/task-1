import java.util.Scanner;

public class Task4 {
//    Напишите метод, который будет вычислять угол между часовой и минутной стрелками часов.
//    На вход функции подаётся время в виде двух переменных: "hours" и "minutes"
//    Расчет угла производить относительно реального поведения стрелок часов.

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
  int angle = (hh + (mm / 60)) * 30 - mm * 6;       
  System.out.println("angle between arrows " + angle + "°");
    }
    
}
