import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
class Node implements Comparable<Node>{
    int x;
    int y;

    @Override
    public String toString() {
        return "Node{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

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


    @Override
    public int compareTo(Node o) {
        if(this.y > o.getY()){
            return 1;
        } else if (this.y < o.getY()) {
            return -1;
        } else if (this.x > o.getX()) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class Main {
    static ArrayList<Node> timeList = new ArrayList<>();
    static boolean[] check = new boolean[11];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> startList = new ArrayList<>();
        ArrayList<Integer> endList = new ArrayList<>();
        int n = scanner.nextInt();

        for(int i = 0 ; i < n ; i ++){
            int startTime = scanner.nextInt();
            int endTime = scanner.nextInt();
            timeList.add(new Node(startTime, endTime));
        }
        Collections.sort(timeList);

        int end = timeList.get(0).getY();
        int count = 1;

        for(int i = 1 ; i < n ; i ++) {
            if (end <= timeList.get(i).getX()) {
                end = timeList.get(i).getY();
                count ++;
            }
        }
        System.out.println(count);
    }
}





