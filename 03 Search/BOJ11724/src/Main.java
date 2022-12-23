import java.util.ArrayList;
import java.util.Scanner;

public class Main {

   static boolean[] check;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        ArrayList<ArrayList<Integer>> graphList = new ArrayList<>();
        check = new boolean[n+1];
        for(int i = 0; i <= n ; i++){
            graphList.add(new ArrayList<>());
        }

        for(int i = 0; i < m ; i++){
            int node1 = scanner.nextInt();
            int node2 = scanner.nextInt();

            graphList.get(node1).add(node2);
            graphList.get(node2).add(node1);
        }
        int count = 0;
        for(int i = 1 ; i <=n ; i ++) {
           if(check[i] == true){
               continue;
           }
           if( dfs(graphList, i) == true)
           {
               count++;
           }
        }

        System.out.println(count);


    }

    private static boolean dfs(ArrayList<ArrayList<Integer>> graphList, int start) {

        check[start] = true;
        for(int i = 0; i < graphList.get(start).size(); i++) {
            if(check[graphList.get(start).get(i)] == false) {
                check[graphList.get(start).get(i)] = true;

                dfs(graphList, graphList.get(start).get(i));
            }
        }
        return true;

    }
}
