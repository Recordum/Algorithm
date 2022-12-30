import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static HashSet<Integer> set = new HashSet<>();
    static ArrayList<Integer> outputList = new ArrayList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    public static void set(String function, int element){
        switch (function) {

            case "add" :
                set.add(element);
                break;

            case "remove" :
                set.remove(element);
                break;

            case "check" :
                if (set.contains(element)) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
                break;

            case "toggle" :
                if (set.contains(element)) {
                    set.remove(element);
                } else {
                    set.add(element);
                }
                break;

            case "all" :
                for (int i = 1; i < 21; i++) {
                   set.add(i);
                }
                break;

            case "empty" :
                set.clear();
                break;

        }
    }



    public static void main(String[] args) throws IOException {


        int n = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String function = st.nextToken();
            if(function.equals("all") || function.equals("empty")){
                set(function,0);
                continue;
            }
            int element = Integer.parseInt(st.nextToken());
            set(function,element);

        }
        System.out.println(sb);
    }
}
