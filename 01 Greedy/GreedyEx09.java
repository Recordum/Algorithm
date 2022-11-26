import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        int[] food_times = {3, 1, 2};
        long k = 5;

        System.out.println(Food.solution(food_times, k));

    }
}
class Food{
    public static int solution(int[] food_times, long k) {
        int answer = 0;
        int sum = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0 ; i < food_times.length ; i++) {

            sum = food_times[i] + sum;
        }

        for(int i = 0 ; i < food_times.length ; i++){
            if(food_times[i] == 0)
                continue;
            count++;

            food_times[i] = food_times[i] - 1;
            sum = food_times[i] + sum;

            if(i == food_times.length-1) {
                i = 0;
                if(sum == 0) {
                    answer = -1;
                    return answer;
                }
             sum = 0;
            }
            if(count == k){
                if(i+1 > food_times.length) {
                    answer = 0;
                }
                else{
                    answer = i+2;
                }
                return answer;
            }


        }
        return answer;
    }
}