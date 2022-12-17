import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Node{
    private int x;
    private int depth;
    public Node(int x, int depth ) {
        this.x = x;
        this.depth = depth;
    }

    public int getX() {
        return x;
    }
    public int getDepth(){
        return depth;
    }

}
public class Main {
    static boolean[] check = new boolean[100001];
    public static int bfs(int n , int m){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(n, 0));
        check[n] =true;
        while (!queue.isEmpty()){
            Node node = queue.poll();
            int x = node.getX();
            int depth = node.getDepth();
            if(x == m){
                return depth;
            }
            if(2 * x <= 100000 && check[2*x] == false) {
                check[2*x] = true;
                queue.offer(new Node(2 * x, depth + 1));
            }
            if (x + 1 <= 100000 && check[x+1] == false) {
                check[x+1] = true;
                queue.offer(new Node(x + 1, depth + 1));
            }
            if( x-1 >= 0 && check[x-1] ==false) {
                check[x-1] = true;
                queue.offer(new Node(x - 1, depth + 1));
            }
            if(2*x == m || x+1 == m || x-1 ==m){
                return depth + 1;
            }
        }
        return -1;
        }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int result = bfs(n,m);
        System.out.println(result);

    }
}
