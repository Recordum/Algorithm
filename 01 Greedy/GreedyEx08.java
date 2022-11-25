import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Timer;

public class GreedyEx08 {
    public static void main(String[] args) {
        int n;
        int m;
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        long beforeTime = System.currentTimeMillis();
        int[] array = new int[n];
        for (int i  = 0 ; i < n; i++){
            array[i] = scanner.nextInt();
            i++;
        }

        int result = 0;
        int overlap = 0 ;

        for (int i = 0 ; i < n ; i++){

            for(int j = i+1 ; j <n ; j++){
                result++;

                if (array[i] == array[j]){
                    overlap++;
                }

            }
        }
        result = result - overlap;
        System.out.println(result);
        long afterTime = System.currentTimeMillis();
        long totalTime = (beforeTime - afterTime)/1000;
        System.out.println(totalTime + "초");
    }
}
