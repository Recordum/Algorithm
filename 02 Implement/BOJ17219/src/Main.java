import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String,String> password = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            password.put(stringTokenizer.nextToken(), stringTokenizer.nextToken());
        }

        for(int i = 0; i < m; i++){
            sb.append(password.get(br.readLine()) + "\n");
        }

        System.out.println(sb);
    }
}
