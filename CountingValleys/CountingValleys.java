package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class CountingValleys {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = scanner.nextLine();
        scanner.close();
        int result = countingValleys(n, s);
        int result2 = countingSeaLevel(n, s);
        System.out.println(result); // choose one of them
        System.out.println(result2); // choose one of them
    }

    private static int var = -1;

    private static int countingValleys(int n, String s){
        int num = 0;
        int sum = 0;
        String[] steps = s.split("");
            for (String i : steps) {
                switch (i) {
                    case "U":
                        num = num + 1;
                        break;
                    case "D":
                        num = num - 1;
                        break;
                    default:
                        System.out.println("Error. Mismatch character!");
                        return 0;
                }// end of SWITCH
                if (num == var){ // 1. first time waiting enter to valey -1
                    if (num == 0){ // 3. after exit from valey switching back for waiting enter to valey
                        var = -1;
                        sum++;
                    } else
                    var = 0; // 2. after entering to valey switching var in order to wait exit from valey
                }
            }// end of FOR
        return sum;
    }// end of METHOD

    private static int countingSeaLevel(int n, String terrain){

        int level = 0; //Start at sea level
        int valleys = 0;
        boolean belowSea = false;

        for(int i = 0; i < n; i++)
        {
            char slope = terrain.charAt(i);
            if(slope == 'U')//Uphill
                level++;
            else//Downhill
                level--;

            //Handle transitions
            if(!belowSea && level < 0)
            {
                valleys++;
                belowSea = true;
            }

            if(level >= 0)//We are back above sea level
                belowSea = false;
        }
        return valleys;
    }
}
