import java.lang.reflect.Field;
import java.util.*;
import java.io.*;

public class Main {
    static int[][] maze;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        maze = new int[n][m];
        visited = new boolean[n][m];
        for(int i = 0 ; i < n ; i++){
            String line = br.readLine();
            for(int j = 0; j <m ; j++) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }
        bfs();
        System.out.println(maze[n-1][m-1]);
    }

    private static void bfs() {
        Queue<Node> queue = new LinkedList<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1 ,1};

        visited[0][0] = true;
        queue.offer(new Node(0,0));

        while(!queue.isEmpty()){
            Node node = queue.poll();
            int x = node.getX();
            int y = node.getY();
            for(int i = 0; i < 4 ; i++){
                if(x+dx[i] < 0 || x+dx[i] > maze.length -1 || y+dy[i] < 0 || y+dy[i] > maze[1].length-1){
                    continue;
                }
                if(maze[x+dx[i]][y+dy[i]] != 0 && visited[x+dx[i]][y+dy[i]] == false){
                    visited[x+dx[i]][y+dy[i]] = true;
                    maze[x+dx[i]][y+dy[i]] = maze[x][y] + 1;
                    queue.offer(new Node(x+dx[i],y+dy[i]));
                }
            }
        }
    }
}
class Node{

    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
