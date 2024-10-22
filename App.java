import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner user = new Scanner(System.in);
        double total, gratuityRate, subtotal, gratuity;
        System.out.print("Please enter your subtotal");
        subtotal = user.nextDouble();
        Scanner user2 = new Scanner(System.in);
        System.out.print("Please enter your gratuity rate");
        gratuityRate = user2.nextDouble()/100;
        gratuity = gratuityRate*subtotal;
        total = gratuity+subtotal;
        System.out.print("Your gratuity is ");
        System.out.print(gratuity);
        System.out.print(" and your total is ");
        System.out.print(total);
    }
}
