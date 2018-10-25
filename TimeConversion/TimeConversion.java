package hackerrankchallenges.ProblemSolving;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        String s = ui.next();
        String result = timeConversion(s);
        System.out.println(result);
    }

    private static String timeConversion(String s) {
        DateFormat dtfrm = new SimpleDateFormat("hh:mm:ssa");
        Date result = new Date();
        try {
            result =  dtfrm.parse(s);
        } catch (Exception ignored) { }
        DateFormat dateReturn =  new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        return dateReturn.format(result);
    }
}
