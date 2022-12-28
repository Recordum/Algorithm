import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] dp = new int[12];
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int[] n = new int[T];
        for(int i = 0 ; i < T; i ++){
            n[i] = scanner.nextInt();
        }
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        int[] result = new int[T];
        for(int i = 0 ; i < T; i++) {
            for (int j = 4; j <= n[i]; j++) {
                dp[j] = dp[j - 3] + dp[j - 2] + dp[j - 1];
            }
            System.out.println(dp[n[i]]);
        }

    }


}
