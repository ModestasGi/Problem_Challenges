package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class DayOfTheProgrammer {

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int year = ui.nextInt();
        String result = converting(year);
        System.out.println(result);
    }

    private static String converting(int year){
        String d = "";
        if(year < 1918) {          //Julian check for leap year
            d += (year % 4 == 0) ? "12.09." + year : "13.09." + year;
        } else if(year == 1918) {  //Special case: transition year
            d += "26.09." + year;
        } else {                   //Gregorian check for leap year
            d += ((year % 400 == 0) ||
                    (year % 4 == 0 && year % 100 != 0)) ? "12.09." + year : "13.09." + year;
        }
        return d;
    }



}
