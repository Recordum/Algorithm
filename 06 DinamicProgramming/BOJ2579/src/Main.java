import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> step = new ArrayList<>();
        int[] dp;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        dp = new int[n];

        for(int i = 0 ; i < n ; i++){
            step.add(Integer.parseInt(br.readLine()));
        }

        if(n<2) {
            dp[0] = step.get(0);
        }else if(n < 3){
            dp[0] = step.get(0);
            dp[1] = step.get(1) + step.get(0);
        }else {
            dp[0] = step.get(0);
            dp[1] = step.get(1) + step.get(0);
            dp[2] = step.get(2) + Math.max(step.get(1), step.get(0));
        }
        for(int i = 3; i< n ; i++){
            dp[i] = step.get(i) + Math.max(dp[i-2], dp[i-3] + step.get(i-1));
        }
        System.out.println(dp[n-1]);
    }
}
