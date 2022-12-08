import com.sun.jdi.request.InvalidRequestStateException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static ArrayList<ArrayList<Integer>> dp= new ArrayList<>();
    public static void fibo(int n){

            dp.get(0).set(0 ,1);
            dp.get(1).set(1 ,1);

        for(int i = 2; i <= n; i++) {
            dp.get(i).set(0,dp.get(i-1).get(0)+dp.get(i-2).get(0));
            dp.get(i).set(1,dp.get(i-1).get(1)+dp.get(i-2).get(1));
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tc = scanner.nextInt();
        for(int i = 0 ; i < 41 ; i++){
         dp.add(new ArrayList<>());
         dp.get(i).add(0,0);
         dp.get(i).add(1,0);
        }
        int[] n = new int[tc];
        for(int i = 0 ; i < tc; i++){
            n[i]  = scanner.nextInt();
            fibo(n[i]);
        }
        for(int i = 0 ; i < tc; i++){
                System.out.print(dp.get(n[i]).get(0) + " " + dp.get(n[i]).get(1));
                System.out.println("");
        }

    }
}
