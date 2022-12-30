import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<ArrayList<Integer>> setList = new ArrayList<>();
    static ArrayList<Integer> outputList = new ArrayList<>();

    public static void set(String function, int element){

        if(function.equals("add")){
            if (setList.get(element).size() != 0) {
                setList.get(element).add(element);
            }
            return;
        }
        if(function.equals("remove")){
            if (setList.get(element).size() != 0) {
                setList.get(element).remove(0);
            }
            return;
        }
        if(function.equals("check")){
            if(setList.get(element).size() != 0){
                outputList.add(1);
            }else{
                outputList.add(0);
            }
            return;
        }
        if(function.equals("toggle")){
            if(setList.get(element).size() != 0){
                setList.get(element).add(element);
            }else{
                setList.get(element).remove(0);
            }
            return;
        }
        if(function.equals("all")){
            for(int i = 1 ;i < 21 ; i++){
                setList.get(i).add(0, i);
            }
        }
        if(function.equals("empty")){
            for(int i = 1 ;i < 21 ; i++){
                setList.get(i).remove(0);
            }
        }
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0 ; i < 21 ; i++){
            setList.add(new ArrayList<Integer>());
        }
        for(int i = 0 ; i < n ; i++){
            String function = scanner.next();
            if(function.equals("all") || function.equals("empty")){
                set(function,0);
                continue;
            }
            int element = scanner.nextInt();
            set(function,element);

        }
        for(int i = 0 ; i< outputList.size() ; i++) {
            System.out.println(outputList.get(i));
        }
    }
}
