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
    public static void binarySearch(int start, int end , int target , ArrayList<Integer> list, int index){
        int mid = (start + end )/2;
        if(start > end){
            return;
        }
            if(list.get(end) - list.get(index) < target){
                return;
            }
            if (list.get(mid) - list.get(index) < target) {
                start = mid + 1;
                binarySearch(start, end, target, list, index);
            } else if (list.get(mid) - list.get(index) > target) {
                end = mid - 1;
                result = Math.min(result, list.get(mid) - list.get(index));
                binarySearch(start, end, target, list, index);
            } else {
                result = target;
                return;
            }

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
        for(int i = 0; i < n ; i++) {
            binarySearch(0, n - 1, m, list, i);
        }
        System.out.println(result);
    }
}