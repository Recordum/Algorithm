import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class SortingEx06 {
    public static void main(String[] args) {

        ArrayList<Integer> keyValue = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer,String> map = new HashMap<>();

        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < n ; i++){
            String student = scanner.next();
            int score = scanner.nextInt();
            scanner.nextLine();
            map.put(score,student);
            keyValue.add(score);

        }
        Collections.sort(keyValue);
        for(int i = 0; i < n ; i++){
            System.out.print(map.get(keyValue.get(i)) + " ");
        }
    }
}
