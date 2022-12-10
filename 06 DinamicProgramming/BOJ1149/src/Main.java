import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] color = new int[n+1][3];
        int[][] dp = new int[1001][3];
        for(int i = 1 ;i <= n ; i++){
            for(int j = 0 ; j< 3; j++) {
                color[i][j] = scanner.nextInt();
            }
        }

        for(int i = 1 ; i <= n ;i++){
            dp[i][0] = Math.min(dp[i-1][1],dp[i-1][2]) + color[i][0];
            dp[i][1] = Math.min(dp[i-1][2],dp[i-1][0]) + color[i][1];
            dp[i][2] = Math.min(dp[i-1][1],dp[i-1][0]) + color[i][2];
        }
        int result=Integer.MAX_VALUE;
        for(int i = 0 ; i < 3 ; i++){
            result = Math.min(result, dp[n][i]);
        }
        System.out.print(result);
    }
}
