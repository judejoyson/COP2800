import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your integer: ");
		long number = input.nextLong();
		System.out.println("The sum of the digits in your number, " + number + ", is " +
			sumDigits(number));
	}

    public static long sumDigits(long n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}

		return sum;
	}
}