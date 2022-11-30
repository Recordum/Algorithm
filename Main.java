import java.util.ArrayList;
import java.util.LinkedList;

class Solution {
    static int[] number = { -2,3,0,2,-5};
    static int answer = 0;
    static int count;

    static LinkedList<Integer> list = new LinkedList<>();

    public static void recursion(int start){
        if(count == 3){
            int result = list.get(0) +list.get(1)+list.get(2);
            if(result == 0){
                answer++;
                return;
            }
        }
        for( int i = start ; i < number.length; i++){

            list.offer(number[i]);
            start++;
            count++;
            recursion(start);
            count--;
        }


    }

    public static void main(String[] args) {
        recursion(0);
        System.out.println(answer);

    }

}
