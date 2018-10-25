package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class BetweenTwoSets3 {

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int aSize = ui.nextInt();
        int bSize = ui.nextInt();
        int[] aLine = new int[aSize];
        for(int i = 0; i < aSize; i++)
            aLine[i] = ui.nextInt();
        int[] bLine = new int[bSize];
        for(int j = 0; j < bSize; j++)
            bLine[j] = ui.nextInt();
        int temp = getResult(aLine, bLine);
        System.out.println(temp);
        ui.close();
    }

    private static int findY(int[] frstLine, int frstLineLength) {
        int res = 1, i;
        for (i = 0; i < frstLineLength; i++)
            res = res*frstLine[i]/ findZ(res, frstLine[i]);
        return res;
    }
    private static int findZ(int a, int b){
        if (a == 0)
            return b;
        return findZ(b%a, a);
    }
    private static int findX(int[] secLine, int secLineLength){
        int result = secLine[0];
        for (int i = 1; i < secLineLength; i++)
            result = findZ(secLine[i], result);
        return result;
    }
    private static int getResult(int[] firstLine, int[] secondLine) {
        int commonA,commonB,count=0;
        commonA = findY(firstLine,firstLine.length);
        commonB = findX(secondLine,secondLine.length);
        for(int i = commonA, j = 2; i <= commonB; i = commonA*j, j++)
            if(commonB%i == 0)
                count++;
        return count;
    }
}
