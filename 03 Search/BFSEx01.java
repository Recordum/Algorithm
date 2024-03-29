import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Node {
    int x, y;
    public Node(int x, int y){
        this.x = x;
        this.y = y;

    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

}
public class BFSEx01 {
    static int n,m;
    static int[][] field;
    static int[] dx = {-1, 1, 0 ,0};
    static int[] dy = {0, 0 ,1, -1};
    static int result = 0;

    public static boolean bfs(int x, int y){
        int nx, ny;
        Queue<Node> array = new LinkedList<>();
        if(field[x][y] == 0) {
            array.offer(new Node(x,y));
            field[x][y] = 1;
            while (!array.isEmpty()) {
                Node node = array.poll();
                x = node.getX();
                y = node.getY();

                for (int i = 0; i < 4; i++) {
                    nx = x + dx[i];
                    ny = y + dy[i];
                    if (nx < 0 || ny < 0 || nx > n - 1 || ny > m - 1) {
                        continue;
                    }
                    if (field[nx][ny] == 1) {
                        continue;
                    }

                    field[nx][ny] = 1;
                    array.offer(new Node(nx,ny));
                }



            }
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        field = new int[n][m];
        String line ;
        scanner.nextLine();
        for(int i =  0 ; i < n ; i++){
            line = scanner.nextLine();
            for(int j = 0 ; j< m ; j++){
                field[i][j] = line.charAt(j) - '0';
            }
        }
        for(int i = 0 ; i< n ; i++){
            for(int j = 0; j<m ; j++){
                if(bfs(i,j) == true) {
                    result++;
                    System.out.println(result);
                    System.out.println("i, j 값 :" + i + "" +j);

                }
            }
        }

        System.out.println(result);


    }
}
