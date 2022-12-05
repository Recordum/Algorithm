import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SoritngEx05 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i <n ; i++){
            array.add(scanner.nextInt());
        }

        Collections.sort(array,Collections.reverseOrder());
    }
}
