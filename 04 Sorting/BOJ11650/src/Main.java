import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> yList = new ArrayList<>();
        ArrayList<Integer> xList = new ArrayList<>();
        int n = scanner.nextInt();

        for(int i = 0; i<n ; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            xList.add(x);
            yList.add(y);
        }
        for(int i = 0; i<xList.size();i++) {
            map.put(xList.get(i), new ArrayList<Integer>());
        }
        for(int i = 0; i<xList.size();i++) {
            map.get(xList.get(i)).add(yList.get(i));
        }
        HashSet<Integer> validateData = new HashSet<Integer>(xList);
        ArrayList duplicateList = new ArrayList<Integer>(validateData);
        Collections.sort(duplicateList);
        for(int i = 0; i<duplicateList.size();i++) {

            Collections.sort(map.get(duplicateList.get(i)));
        }

        for(int i = 0; i< duplicateList.size() ; i++){

            for(int j = 0; j< map.get(duplicateList.get(i)).size() ; j++){

                System.out.print(duplicateList.get(i) + " " + map.get(duplicateList.get(i)).get(j));
                System.out.println("");
            }

        }


    }
}
