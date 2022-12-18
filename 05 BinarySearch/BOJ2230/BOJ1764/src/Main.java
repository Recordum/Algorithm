import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int n,m;
    static ArrayList<String> neverHeard = new ArrayList<>();
    static ArrayList<String> never = new ArrayList<>();

    public static void BinarySearch(String neverSeen,int start, int end){
        int mid = (start + end)/2;
        if(start>end){
            return;
        }
        if(neverHeard.get(mid).compareTo(neverSeen) == 0){
            never.add(neverSeen);
            return;
        }else if(neverHeard.get(mid).compareTo(neverSeen) > 0){
            BinarySearch(neverSeen,start,mid -1 );
        }else{
            BinarySearch(neverSeen,mid + 1,end);
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n ; i++){
            neverHeard.add(scanner.nextLine());
        }
        Collections.sort(neverHeard);
        for(int i = 0; i< m ; i++){
            String neverSeen = scanner.nextLine();
            BinarySearch(neverSeen, 0 , n-1);
        }
        Collections.sort(never);
        System.out.println(never.size());
        for(int i = 0; i < never.size() ; i++) {
            System.out.println(never.get(i));
        }
    }
}
