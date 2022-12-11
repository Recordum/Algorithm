import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int n, m;
    static boolean[] flag ;

    public static void dfs(int start , ArrayList<ArrayList<Integer>> graph){

            for(int j = 0 ; j < graph.get(start).size(); j++){
                if(flag[graph.get(start).get(j)] == false){
                    flag[graph.get(start).get(j)] = true;
                    dfs(graph.get(start).get(j), graph);
                }

            }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        flag = new boolean[n+1];
        flag[1] = true;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0 ; i < n + 1 ; i++){
            graph.add(new ArrayList<>());
        }
        for(int i = 1 ; i < m + 1 ; i++){
            int node = scanner.nextInt();
            int element = scanner.nextInt();
            graph.get(node).add(element);
            graph.get(element).add(node);
        }
        dfs(1, graph);
        int result = -1;
        for(int i = 0; i < n+1; i++){
            if(flag[i] == true){
                result++;
            }
        }
        System.out.print(result);
    }
}
