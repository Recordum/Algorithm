
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Stack{
    public ArrayList<Integer> stackList = new ArrayList<>();

    public void push(int x){
        stackList.add(x);
    }
    public int pop(){
        if(stackList.isEmpty()){
            return  -1;
        }
        int popElement = stackList.get(stackList.size() - 1);
        stackList.remove(stackList.size() -1 );
        return popElement;
    }

    public int size(){
        return stackList.size();
    }

    public int empty(){
        if(stackList.isEmpty()){
            return 1;
        }else{
            return  0;
        }
    }

    public int top(){
        if(stackList.isEmpty()){
            return -1;
        }else{
            return stackList.get(stackList.size()-1);
        }
    }

}
public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer st ;
        Stack stack = new Stack();
        ArrayList<Integer> result = new ArrayList<>();
        int element;

        String input;
        for(int i = 0 ; i < n ; i++){
            st = new StringTokenizer(bufferedReader.readLine());
            switch (input = st.nextToken()) {

                case "push" : element = Integer.parseInt(st.nextToken());
                                stack.push(element);
                                break;

                case "top" : result.add(stack.top()); break;

                case "size" : result.add(stack.size()); break;

                case "pop" : result.add(stack.pop()); break;

                case "empty" : result.add(stack.empty()); break;
            }
        }
        for(int i = 0; i< result.size();i++) {
            System.out.println(result.get(i));
        }
    }
}
