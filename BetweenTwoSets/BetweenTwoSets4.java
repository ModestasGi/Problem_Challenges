package hackerrankchallenges.ProblemSolving;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BetweenTwoSets4 {
// not necessary to define sizes of set submitting for comparison!!!
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        // System.out.println("Right away put in the lines to compare");

        List<Integer> a = Arrays.stream(stdin.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> b = Arrays.stream(stdin.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int aMax = a.stream().max(Comparator.comparingInt((Integer o) -> o)).get();
        int bMin = b.stream().min(Comparator.comparingInt((Integer o) -> o)).get();
        List<Integer> result = IntStream.range(aMax, bMin + 1).filter(num -> a.stream().allMatch(i -> num % i == 0) && b.stream().allMatch(j -> j % num == 0))
                .boxed().collect(Collectors.toList());
        System.out.println(result.size());
        stdin.close();
    }

}
