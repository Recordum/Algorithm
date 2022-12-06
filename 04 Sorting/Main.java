import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;

import java.util.StringTokenizer;

public class Main {
    static int n,m;
    static Integer result = Integer.MAX_VALUE;
    public static int binarySearch(int start, int end , int target , ArrayList<Integer> list){
        int mid = (start + end )/2;
        if(start > end){
            return result;
        }
        for(int i = 0 ; i < n ; i++) {
            if(list.get(end) - list.get(i) < target){
                return result;
            }
            if (list.get(mid) - list.get(i) < target) {
                start = mid + 1;
                return binarySearch(start, end, target, list);
            } else if (list.get(mid) - list.get(i) > target) {
                end = mid - 1;
                result = Math.min(result, list.get(mid) - list.get(i));
                return binarySearch(start, end, target, list);
            } else {
                return list.get(mid);
            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

         n = Integer.parseInt(st.nextToken());
         m = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        int ans = binarySearch(0, n-1, m, list);
        System.out.println(ans);
    }
}