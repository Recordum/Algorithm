import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] coin = new int[n];
        int max = 0;
        int count = 0;
        for(int i = 0 ; i< n ; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }

        for(int i = n-1 ; i > -1 ; i--){
            if(coin[i] <= k){
                max= i;
                break;
            }
        }
        for(int i = 0; i <= max ; i ++) {
            if(k/coin[max-i] ==0){
                continue;
            }
            count = count + k / coin[max-i];

            if (k % coin[max - i] == 0) {
                    break;
            }
            k = k%coin[max-i];
        }

        System.out.println(count);
    }
}
