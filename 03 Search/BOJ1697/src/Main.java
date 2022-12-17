import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<Node> queue
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        dp[n] = 0;
        for(int i = n +1 ; i < m +1 ; i++){
            dp[i] = dp[i-1] + 1;

            if(i / dp[i-1] == 2){
                dp[i] = Math.min(dp[i/2] + 1, dp[i]);
            }
            dp[i] = Math.min(dp[i+1] + 1 ,dp[i]);

        }
        System.out.println(dp[m]);

    }
}
