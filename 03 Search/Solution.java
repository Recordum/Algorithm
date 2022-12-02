import java.util.*;

public class Solution {
    static int n, m;
    static int start = 0;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static ArrayList<Integer> resultBfs = new ArrayList<>();
    static ArrayList<Integer> resultDfs = new ArrayList<>();
    static boolean[] visitDfs = new boolean[1001];
    static boolean[] visitBfs = new boolean[1001];
    public static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);

        while (!queue.isEmpty()){
            int x = queue.poll();
            visitBfs[x] = true;
            resultBfs.add(x);
            for(int i = 0; i<graph.get(x).size();i++){
                if(graph.get(x).get(i) == 0){
                    continue;
                }
                int y = graph.get(x).get(i);
                if(visitBfs[y] == false){
                    visitBfs[y] = true;
                    queue.offer(y);
                }
            }
        }

    }
    public static void dfs(int start){
        resultDfs.add(start);
        visitDfs[start] = true;
        for(int i = 0; i<graph.get(start).size();i++) {
            if(graph.get(start).get(i) == 0){
                continue;
            }
            int x = graph.get(start).get(i);
            if(visitDfs[x] == false) {
                visitDfs[start] = true;
                dfs(x);
            }
        }

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        start = scanner.nextInt();
        for(int i = 0; i< n+1 ; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++){
            int index = scanner.nextInt();
            int value = scanner.nextInt();
            graph.get(index).add(value);
            graph.get(value).add(index);
        }
        for(int i = 0; i< n+1 ; i++){
            Collections.sort(graph.get(i));
        }

        bfs(start);
        dfs(start);

        for(int i = 0; i < n ;i++){
            try {
                System.out.print(resultDfs.get(i) + " ");
            }catch (IndexOutOfBoundsException e){
                break;
            }
        }
        System.out.println("");
        for(int i = 0; i < n;i++){
           try{
               System.out.print(resultBfs.get(i) + " ");
           }catch (IndexOutOfBoundsException e){
               break;
           }
        }

    }
}
