import java.util.Scanner;

public class Calander {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt(); 
        System.out.print("Enter the year: "); 
        int year = input.nextInt();
        int daysInMonth = 0;
        String monthName = "noMonth";
        if (year <= 0) {
            System.out.println("Invalid year. Please enter a positive integer."); System.exit(0);
        }
        switch (month) {
            case 1: monthName = "January";  daysInMonth = 31; break;
            case 2: monthName = "February";
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    daysInMonth = 29;
                    } else {
                    daysInMonth = 28;
                    }
                     break;
            case 3: monthName = "March";    daysInMonth = 31; break;
            case 4: monthName = "April";    daysInMonth = 30; break;
            case 5: monthName = "May";     daysInMonth = 31; break;
            case 6: monthName = "June";    daysInMonth = 30; break;
            case 7: monthName = "July";    daysInMonth = 31; break;
            case 8: monthName = "August";  daysInMonth = 31; break;
            case 9: monthName = "September";    daysInMonth = 30; break;
            case 10: monthName = "October"; daysInMonth = 31; break;
            case 11: monthName = "November";    daysInMonth = 30; break;
            case 12: monthName = "December";    daysInMonth = 31; break;
            default: System.out.println("Invalid month. Please enter a value between 1 and 12.");
                     System.exit(0);
        }
        System.out.println(monthName +" " +year+ " has "+daysInMonth + " days");
        }


    }
