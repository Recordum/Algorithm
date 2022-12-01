import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    static int n, m;
    static int start = 0;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static ArrayList<Integer> list = new ArrayList<>();
    public static void bfs(){


    }
    public static void dfs(){


    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        start = scanner.nextInt();
        for(int i = 0; i< n+1 ; i++){
            graph.add(list);
        }

        for(int i = 0; i < m; i++){
            int index = scanner.nextInt();
            int value = scanner.nextInt();
            graph.get(index).add(value);
        }


    }
}
