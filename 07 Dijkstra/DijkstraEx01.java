import javax.script.ScriptContext;
import java.util.*;

class Node implements Comparable<Node> {
    int index;
    int distance;
    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public int getIndex() {
        return index;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public int compareTo(Node otherNode) {
        if(this.distance < otherNode.distance){
            return -1;
        }else{
            return 1;
        }
    }
}
public class DijkstraEx01 {
    static int INF = (int) 1e9;
    static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
    static int n,m;
    static ArrayList<Integer> dList = new ArrayList();

    public static void dijkstra(int start){

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));
        dList.set(start, 0);
        while(!pq.isEmpty()){
            Node node = pq.poll();
            int distance = node.getDistance();
            int index = node.getIndex();
            if(dList.get(index) < distance) continue;
            for(int i = 0; i < graph.get(index).size(); i++){
                int cost = dList.get(index) + graph.get(index).get(i).getDistance();
                if(dList.get(graph.get(index).get(i).getIndex()) > cost){
                    dList.set(graph.get(index).get(i).getIndex(), cost);
                    pq.offer(new Node(graph.get(index).get(i).getIndex(), cost));
                }
            }

        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int start = scanner.nextInt();

        for(int i = 0; i <= n ; i++){
            graph.add(new ArrayList<Node>());
            dList.add(INF);
        }
        for(int i = 0; i < m ; i++){
            int beforeNode = scanner.nextInt();
            int afterNode = scanner.nextInt();
            int distance = scanner.nextInt();
            graph.get(beforeNode).add(new Node(afterNode, distance));
        }
        dijkstra(start);

        for(int i = 1; i <= n ; i++) {
            System.out.println(dList.get(i));

        }



    }
}
