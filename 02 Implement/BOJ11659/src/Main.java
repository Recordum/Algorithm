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
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int [] array = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }


        ArrayList<Map> rangeList = new ArrayList<>();
        ArrayList<Integer> keyList = new ArrayList<>();
        for(int i = 0 ; i < m ; i ++){
            st = new StringTokenizer(br.readLine());
            rangeList.add(new HashMap<Integer,Integer>());
            int key = Integer.parseInt(st.nextToken());
            rangeList.get(i).put(key,Integer.parseInt(st.nextToken()));
            keyList.add(key);
        }
        int[] result = new int[m];
        for(int i = 0; i < m ; i++){
            int j = (int)rangeList.get(i).get(keyList.get(i)) -1;

            for(int k = keyList.get(i)-1 ; k <= j ; k++){
                result[i] = array[k] + result[i];
            }
            sb.append(result[i] + "\n");
        }

        System.out.println(sb);

    }
}
