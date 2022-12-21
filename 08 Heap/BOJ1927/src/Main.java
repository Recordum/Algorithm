import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static ArrayList<Long> outputList = new ArrayList<>();

    public static void minHeap(ArrayList<Long> inputList){
        PriorityQueue<Long> priorityQueue = new PriorityQueue();
        for(int i = 1; i < inputList.size() ; i++){
            if(inputList.get(i) != 0){
                priorityQueue.offer(inputList.get(i));
            }else if(inputList.get(i) == 0 && priorityQueue.isEmpty()){
                outputList.add(0L);
            }else{
                outputList.add(priorityQueue.poll());
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Long> inputList = new ArrayList<>();

        for(int i = 0 ; i <= n ; i++){
            inputList.add(0L);
        }
        for(int i = 1 ; i<= n; i++){
            inputList.set(i, scanner.nextLong());
        }
        minHeap(inputList);

        for(int i = 0; i<outputList.size() ; i++){
            System.out.println(outputList.get(i));
        }


    }
}
