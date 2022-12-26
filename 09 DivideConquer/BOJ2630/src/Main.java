import java.util.*;

class Node{
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {
    static int white = 0;
    static int blue = 0;
    static  ArrayList<ArrayList<Integer>> field = new ArrayList<>();
    static boolean[][] check;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        check = new boolean[n][n];
        for(int i = 0 ; i < n ; i ++){
                field.add(new ArrayList<>());
            for(int j = 0 ; j < n ; j++){
                field.get(i).add(scanner.nextInt());
            }
        }
        divide(n, 0, 0);

        System.out.println(white);
        System.out.println(blue);


    }

    public static void divide(int n, int x, int y) {
        if(search(x, y, n)) {
            divide(n / 2, x, y);
            divide(n / 2, x + n / 2 , y);
            divide(n / 2, x + n / 2 , y + n / 2 );
            divide(n / 2, x, y + n / 2 );
        }else if(field.get(x).get(y) == 0){
            white++;
        }else{
            blue++;
        }
    }


    public static boolean search(int startX, int startY, int n){

        for(int i = startX  ; i < startX + n ; i++){
            for(int j = startY ; j < startY + n ; j++){
                if(field.get(i).get(j) != field.get(startX).get(startY)){
                    return true;
                }
            }
        }

        return false;
    }
}
