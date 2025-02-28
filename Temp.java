import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double temp = scan.nextDouble();

        if (temp > 30) {
            System.out.println("Weather Condition: Hot");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("Weather Condition: Warm");
        } else if (temp >= 10 && temp < 20) {
            System.out.println("Weather Condition: Moderate");
        } else {
            System.out.println("Weather Condition: Cold");
        }

    
    }
}
