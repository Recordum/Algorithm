import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Node {
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

public class Main {
    static boolean[][] check;
    static int count;
    static ArrayList<ArrayList<Integer>> box = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        ArrayList<Node> start = new ArrayList<>();
        check = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            box.add(new ArrayList<Integer>());
            for (int j = 0; j < m; j++) {
                int tomato = scanner.nextInt();
                box.get(i).add(tomato);
                if(tomato == 1){
                    start.add(new Node(i,j));
                }
            }
        }

        count = bfs(start);

        boolean tomatoCheck =false ;
        for(int i = 0; i< n; i++) {
            for (int j = 0; j < m; j++) {
                if(box.get(i).get(j) == 0 ){
                    tomatoCheck = true;
                }
            }
        }
        if(tomatoCheck == true){
            System.out.println(-1);
        }else{
            System.out.println(count);
        }



    }

    private static int bfs(ArrayList<Node> start) {
        Queue<Node> queue = new LinkedList<>();
        for(int i = 0 ; i< start.size() ; i++) {
            check[start.get(i).getX()][start.get(i).getY()] = true;
            queue.offer(new Node(start.get(i).getX(), start.get(i).getY()));
        }
        int x = 0;
        int y= 0;
        int[] dx = {1, -1, 0 ,0};
        int[] dy = {0, 0, 1 ,-1};
        while(!queue.isEmpty()){
            Node node = queue.poll();
            x = node.getX();
            y = node.getY();
            for(int i = 0 ; i < 4 ; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx < 0 || ny < 0 || nx >= box.size()|| ny >= box.get(1).size()){
                    continue;
                }
                if(box.get(nx).get(ny) == 0){
                    box.get(nx).set(ny, box.get(x).get(y) + 1);
                    check[nx][ny] = true;
                    queue.offer(new Node(nx, ny));
                }
            }

        }
        return box.get(x).get(y) -1 ;
    }
}
