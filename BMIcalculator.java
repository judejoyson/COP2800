import java.util.Scanner;
public class BMIcalculator {
    public static void main(String[] args) throws Exception {
        double weight, heightFeet, heightInches, totalHeight, bmi, totalHeightInches;
        System.out.println("This program will calculate yoyur BMI using your height in and weight");
        System.out.println("Please enter your weight in pounds");
        Scanner user1 = new Scanner(System.in);
        weight = user1.nextDouble();
        System.out.println("Enter feet: ");
        Scanner user2 = new Scanner(System.in);
        heightFeet = user2.nextDouble();
        System.out.println("Enter inches: ");
        Scanner user3 = new Scanner(System.in);
        heightInches = user3.nextDouble();
        totalHeight = (heightFeet*12)+heightInches;
        totalHeightInches = totalHeight*totalHeight;
        bmi = 703*(weight/totalHeightInches);
        System.out.print("Your BMI is ");
        System.out.println(bmi);
        if (bmi<18.5){
            System.out.println("You are underweight");
        }else if ((bmi>18.5) && (bmi<24.9)){
            System.out.println("You are normal weight");
        }else if ((bmi>25) && (bmi<29.9)){
            System.out.println("You are overweight");
        }else{
            System.out.println("Obesity");
        }
        








    }
}
