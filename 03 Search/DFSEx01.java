import java.lang.reflect.Field;
import java.util.Scanner;

public class DFSEx01 {
    static int n,m;
    static int[][] field;

    public static boolean dfs(int x, int y) {
        int flag = 2;
        if( x < 0 || y < 0 || x >= n || y>= m){
            return false;
        }

        if(field[x][y] == 0){
            field[x][y] = flag;
            dfs(x-1,y);
            dfs(x+1,y);
            dfs(x,y-1);
            dfs(x,y+1);
            return true;
        }return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        field = new int[n][m];
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j< m ; j++){
                field[i][j] = scanner.nextInt();
            }
        }

        int result = 0;
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j< m ; j++) {

                if (dfs(i,j) == true){
                    result ++;
                }
            }
        }
        for(int i = 0 ; i< n ; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(field[i][j] +" ");
            }
            System.out.println("");
        }
        System.out.println(result);
    }
}
