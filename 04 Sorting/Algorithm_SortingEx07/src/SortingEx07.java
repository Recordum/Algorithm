import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SortingEx07 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        for(int i = 0 ; i < n ; i++){
            a.add(scanner.nextInt());
        }
        for(int i = 0 ; i < n ; i++){
            b.add(scanner.nextInt());
        }
        Collections.sort(a);
        Collections.sort(b, Collections.reverseOrder());
        for(int i = 0 ; i< k ; i++){
            if(a.get(i) < b.get(i)){
                int temp = a.get(i);
                a.set(i,b.get(i));
                b.set(i,temp);
            }else{
                break;
            }

        }
        for(int i = 0 ; i < n ; i++){
            result = result + a.get(i);
        }
        System.out.print(result);
    }
}
