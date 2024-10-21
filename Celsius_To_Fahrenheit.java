import java.util.Scanner;

public class Celsius_To_Fahrenheit {
    public static void main(String args[]) {
        double fahrenheit, celsius;
        System.out.println("Enter a degree in Celsius:");
        Scanner user = new Scanner(System.in);
        celsius = user.nextDouble();
        fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.print("Your degrees in farenheit is:");
        System.out.println(fahrenheit);
    }
}
