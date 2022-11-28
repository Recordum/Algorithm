import java.util.Scanner;

public class DFSEx02 {
    static int n , m;
    static int field[][];
    static int result = 0;

    public static void dfs(int x, int y, int depth){

        if(x < 0 || y< 0 || x>n-1 || y>m-1){
            return;
        }
        if(x == n-1 && y == m-1){
            if(result == 0){
                result = depth;
            }else{
                result = result < depth ? result : depth;
            }

            return;
        }
        if(field[x][y] == 1) {
            field[x][y] = 0;

            dfs(x-1,y,depth+1);
            dfs(x+1,y,depth+1);
            dfs(x,y+1,depth+1);
            dfs(x,y-1,depth+1);
        }

        return;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        field = new int[n][m];

        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j <m ; j++){
                field[i][j] = scanner.nextInt();
            }
        }
        dfs(0,0, 1);

        System.out.println(result);
        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j <m ; j++){
                System.out.print(field[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
