import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lineList = new ArrayList<>();
        int n = scanner.nextInt();
        int[] dp = new int[n];
        for(int i = 0 ; i < n ; i++){
            lineList.add(scanner.nextInt());
        }

        Collections.sort(lineList);

        dp[0] = lineList.get(0);

        for(int i =1 ; i< n ; i++) {
            dp[i] = lineList.get(i) + dp[i-1];
        }
        int result = 0;
        for(int i = 0 ; i< n ; i++){
            result = result + dp[i];
        }

        System.out.println(result);
    }
}
