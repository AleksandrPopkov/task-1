import java.util.Scanner;

public class BaseConverter {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input degrees Celsius: ");
        while (!in.hasNextFloat()) {
            System.out.println("That not a number! Input degrees Celsius: ");
            in.next();
        }
        float celsius = in.nextFloat();
        
        System.out.print("(Input 1 to Fahrenheit or input 2 to Kelvin) Convert to: ");
        while (!in.hasNextInt()) {
            System.out.println("Input 1 or 2: ");
            in.next();
        }

        int variant = in.nextInt();
        
        if (variant != 1 && variant != 2) {
            System.out.println("Unknown conversion system. Convert to Calvin by default");
        }
        
        convert(celsius, variant);
        
        in.close();
    }
    
    public static void convert(float original, int ext) {
        if (ext == 1) {
            System.out.println(original + " Celsius equals " + ((original * 9/5) + 32) + " Fahrenheit");
        } else {
            System.out.println(original + " Celsius equals " +  (original + 273.15) + " Kelvin");
        }
    }
}
