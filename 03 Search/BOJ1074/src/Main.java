import java.util.Scanner;

public class Main {
    int count = 0;
    public static void dfs(int[][] array, int N){
        int start = 0;
        int[] dx = {2^(N-1),-2^(N-1),2^(N-1)};
        int[] dy = {0,2^(N-1),0};
        int x = 0;
        int y = 0;
        for(int i = 0; i< 3; i++){
            if(array[x + dx[i]][y + dy[i]] == 0){
                array[x + dx[i]][y + dy[i]] = 1;
                count ++;
            }
        }
        array[0][0] = 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int r = scanner.nextInt();
        int c = scanner.nextInt();

        int[][] array = new int[2^N][2^N];

        dfs(array)
    }
}
