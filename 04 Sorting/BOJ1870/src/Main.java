import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> coordinate = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        ArrayList<Integer> inputList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++) {
            int element = Integer.parseInt(st.nextToken());
            inputList.add(element);
            coordinate.add(element);
        }
        Collections.sort(coordinate);

        Map<Integer,Integer> map = new HashMap<>();
        int count=0;
        
        for(int i = 0; i < n ; i++){
            if(!map.containsKey(coordinate.get(i))) {
                map.put(coordinate.get(i), count);
                count++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n ; i++){
            sb.append(map.get(inputList.get(i)) + " ");
        }
        System.out.print(sb);

    }
}
