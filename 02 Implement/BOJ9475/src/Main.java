import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());



        int [] result = new int[t];
        StringBuilder sb = new StringBuilder();
        for(int test = 0; test < t ; test++){
            Map<String, ArrayList<String>> map = new HashMap<>();
            ArrayList<String> keyList = new ArrayList<>();
            int n = Integer.parseInt(br.readLine());
            for(int i = 0 ; i < n ; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String cloth = st.nextToken();
                String type = st.nextToken();
                if (map.containsKey(type)) {
                    map.get(type).add(cloth);
                } else {
                    map.put(type, new ArrayList<>());
                    map.get(type).add(cloth);
                    keyList.add(type);
                }
            }

            result[test] = 1;
            for(int i = 0; i < map.size() ; i++){
                result[test] = result[test] * (map.get(keyList.get(i)).size() + 1);
            }

            sb.append(result[test] -1 + "\n");
        }

        System.out.println(sb);
    }
}
