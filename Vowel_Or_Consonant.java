import java.util.Scanner;

public class Vowel_Or_Consonant {
    public static void main(String[] args) throws Exception {
        System.out.println("This program will check whether a later is a vowel or a constant");
        Scanner user = new Scanner(System.in);
        System.out.println("Please enter your letter");
        String charachter = user.nextLine().toUpperCase();
        char ch = charachter.charAt(0);

		if (Character.isLetter(ch))
		{
			switch(Character.toUpperCase(ch))
			{
				case 'A': 
				case 'E': 
				case 'I': 
				case '0': 
				case 'U': System.out.println(ch + " is a vowel"); break;
				default : System.out.println(ch + " is a consonant"); 
			}
		}
		else
			System.out.println(ch + " is an invalid input");


    }
}
