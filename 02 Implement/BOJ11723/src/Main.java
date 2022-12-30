import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer> setList = new ArrayList<>();
    static StringBuilder outputList = new StringBuilder();

    public static void set(String function, int element){
        switch (function) {

            case "add" :
                setList.set(element, 1);
                break;

            case "remove" :
                setList.set(element,0);
                break;

            case "check" :
                if (setList.get(element) == 0) {
                    outputList.append("0\n");
                } else {
                    outputList.append("1\n");
                }
                break;

            case "toggle" :
                if (setList.get(element) == 0) {
                    setList.set(element,1);
                } else {
                    setList.set(element,0);
                }
                break;

            case "all" :
                for (int i = 1; i < 21; i++) {
                    if (setList.get(i) == 0) {
                        setList.set(i, 1);
                    }
                }
                break;

            case "empty" :
                for (int i = 1; i < 21; i++) {
                    if (setList.get(i) != 0) {
                        setList.set(i, 0);
                    }
                }

        }
    }



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < 21 ; i++){
            setList.add(0);
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
        System.out.println(outputList);
    }
}
