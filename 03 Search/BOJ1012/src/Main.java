import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n,m,k,t;
    static int[] result;
    static int[][] array;
    static boolean[][] visited;
    public static boolean dfs(int x, int y){

            if(x < 0 || y< 0 || x > m-1 || y > n-1) {
                return false;
            }
            if(visited[x][y] == false && array[x][y] == 1){

                    visited[x][y] = true;
                    dfs(x+1,y);
                    dfs(x-1,y);
                    dfs(x,y+1);
                    dfs(x,y-1);
                    return true;
            }


        return false;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        result = new int[t];
        for(int test = 0; test < t ; test++){
            m = scanner.nextInt();
            n = scanner.nextInt();
            k = scanner.nextInt();
            array = new int[m][n];
            visited = new boolean[m][n];
            for(int i = 0; i < k ; i++){
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                array[x][y] = 1;
            }
            for(int i = 0 ; i < m ; i++){
                for(int j = 0; j<n ; j++){
                    if (dfs(i, j) == true){
                    result[test]++;
                    }
                }
            }
        }
        for(int test = 0; test < t ; test++) {
            System.out.println(result[test]);
        }
    }
}
