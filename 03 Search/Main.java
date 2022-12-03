import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int n, m, x, y;
    static int k, t;
    static int[] result;
    static boolean[][] check = new boolean[50][50];

    public static boolean dfs(int x, int y, int[][] array) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        if (array[x][y] == 0 || x < 0 || y < 0 || x > m - 1 || y > n - 1) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || ny < 0 || nx > m - 1 || ny > n - 1) {
                return false;
            }
            if (check[nx][ny] == false && array[nx][ny] == 1) {
                check[nx][ny] = true;
                x = nx;
                y = ny;
                dfs(x, y, array);
                return true;
            }

        }
        return false;
    }
        public static void main (String[]args) {
            Scanner scanner = new Scanner(System.in);

            t = scanner.nextInt();
            result = new int[t];
            //t수만큼 반복
            for(int test = 0 ; test < t ; test++) {
                n = scanner.nextInt();
                m = scanner.nextInt();
                k = scanner.nextInt();
                int[][] array = new int[n][m];

                for (int i = 0; i < k; i++) {
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    array[y][x] = 1;
                }

                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        dfs(i, j, array);
                        if (dfs(i, j,array) == true) {
                            result[test]++;
                        }
                    }
                }
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {

                        check[i][j] = false;
                    }

                }
            }
            for(int test = 0 ; test < t ; test++){
                System.out.println(result[test]);
            }

            }
}
