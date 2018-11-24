package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ACMICPCTeamSolution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        IntStream.range(0, n).forEach(i -> topic[i] = scanner.nextLine());

        int[] result = acmTeam(topic, m);

        for (int y = 0; y < result.length; y++) {
            System.out.println(result[y]);

            if (y != result.length - 1) {
                System.out.println("\n");
            }
        }

        scanner.close();
    }

    // Complete the acmTeam function below.
    private static int[] acmTeam(String[] topic, int m) {
        int[] result = new int[2];
        int maxSkills = 0;
        int maxSkillTeams = 0;

        for(int i = 0; i < topic.length; i++) {
            for(int j = i+1; j < topic.length; j++) {
                String member1 = topic[i];
                String member2 = topic[j];
                int skillSet = 0;

                for(int k = 0; k < m; k++) {
                    if(member1.charAt(k) == '1' || member2.charAt(k) == '1'){
                        skillSet++;
                    }
                }

                maxSkillTeams += (maxSkills == skillSet) ? 1 : 0;

                if(skillSet > maxSkills) {
                    maxSkillTeams = 1;
                    maxSkills = skillSet;
                }
            }
        }

        result[0] = maxSkills;
        result[1] = maxSkillTeams;

        return result;
    }

}
