package hackerrankchallenges.ProblemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PickingNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.pickingNumbers(a);

        System.out.println(result);

        bufferedReader.close();
    }

}
class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    static int pickingNumbers(List<Integer> a) {
        // Write your code here
        int result = 0;

        Map<Integer, Integer> app = new HashMap<>();
        for(int i = 0; i < a.size(); i++){
            int num = a.get(i);
            if (app.containsKey(num)){
                app.put(num, app.get(num)+1);
            } else {
                app.put(num,1);
            }
        }

        for(int i : app.keySet()) {
            int left = (app.containsKey(i-1)) ? app.get(i) + app.get(i-1) : app.get(i);
            int right = (app.containsKey(i+1)) ? app.get(i) + app.get(i+1) : app.get(i);

            if(left > result) {
                result = left;
            }
            if(right > result) {
                result = right;
            }
        }
        return result;
    }
}