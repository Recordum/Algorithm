import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<LinkedList<Integer>> setList = new ArrayList<>();
    static ArrayList<Integer> outputList = new ArrayList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    public static void set(String function, int element){
        switch (function) {

            case "add" :
                if (setList.get(element).size() == 0) {
                    setList.get(element).add(element);
                }
                break;

            case "remove" :
                if (setList.get(element).size() != 0) {
                    setList.get(element).remove(0);
                }
                break;

            case "check" :
                if (setList.get(element).size() == 0) {
                    sb.append("0\n");
                } else {
                    sb.append("1\n");
                }
                break;

            case "toggle" :
                if (setList.get(element).size() == 0) {
                    setList.get(element).add(element);
                } else {
                    setList.get(element).remove(0);
                }
                break;

            case "all" :
                for (int i = 1; i < 21; i++) {
                    if (setList.get(i).size() == 0) {
                        setList.get(i).add(0, i);
                    }
                }
                break;

            case "empty" :
                for (int i = 1; i < 21; i++) {
                    if (setList.get(i).size() != 0) {
                        setList.get(i).remove(0);
                    }
                }

        }
    }



    public static void main(String[] args) throws IOException {


        int n = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < 21 ; i++){
            setList.add(new LinkedList<Integer>());
        }
        for(int i = 0 ; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String function = st.nextToken();
            if(function.equals("all") || function.equals("empty")){
                set(function,0);
                continue;
            }
            int element = Integer.parseInt(st.nextToken());
            set(function,element);

        }
        System.out.println(sb);
    }
}
