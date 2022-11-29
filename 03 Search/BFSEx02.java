import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {

    private int x ,y;
    private int depth;

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
public class BFSEx02 {

    static int n,m;
    static int[][] field;

    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static int flag = 2;

    public static int bfs(int x, int y){

        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x,y));
        while(!queue.isEmpty()){

            Node node =queue.poll();
            x = node.getX();
            y = node.getY();
            for(int i = 0 ; i < 4 ; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx<0 || ny<0 || nx>n-1 || ny>m-1){
                    continue;
                }
                if(field[nx][ny] == 0){
                    continue;
                }
                field[nx][ny] = field[x][y] + 1;
                if(nx == n-1 && ny == m-1){
                    return field[nx][ny];
                }
                queue.offer(new Node(nx,ny));
            }
        }

        return 0;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       n = scanner.nextInt();
       m = scanner.nextInt();
       scanner.nextLine();
       field = new int[n][m];

       for(int i = 0 ; i < n ; i++){
           String list = scanner.nextLine();

           for(int j = 0 ; j< m ; j++){

               field[i][j] = list.charAt(j) - '0';

           }
       }
        int result = bfs(0,0);
       System.out.println(result);


    }
}
