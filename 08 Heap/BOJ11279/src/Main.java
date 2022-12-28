import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<Integer> outputList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> inputList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            inputList.add(Integer.parseInt(br.readLine()));
        }

        maxHeap(inputList);
        for (int i = 0; i < outputList.size(); i++) {
            System.out.println(outputList.get(i));
        }
    }

    private static void maxHeap(ArrayList<Integer> inputList) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i) != 0) {
                priorityQueue.offer(inputList.get(i));
                }
            if (inputList.get(i) == 0 && priorityQueue.isEmpty()) {
                    outputList.add(0);
                    continue;
            }
            if (inputList.get(i) == 0) {
                    outputList.add(priorityQueue.poll());
            }

            }


        }


    }


