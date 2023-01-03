import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expression = br.readLine();
        StringBuilder sb = new StringBuilder();
        int pCount = 0;
        int mCount = 0;
        int result = 0;
        for(int i =0; i < expression.length() ; i++){

            if(expression.charAt(i) == '+'){
                if(pCount == 0 && mCount ==0){
                    result = Integer.parseInt(String.valueOf(sb));
                    sb.setLength(0);
                }else if(mCount >0){
                    result = result - Integer.parseInt(String.valueOf(sb));
                    sb.setLength(0);
                }else {
                    result = result + Integer.parseInt(String.valueOf(sb));
                    sb.setLength(0);
                }
                pCount++;
            }else if(expression.charAt(i) == '-'){
                if(pCount == 0 && mCount ==0){
                    result = Integer.parseInt(String.valueOf(sb));
                    sb.setLength(0);
                }else if(mCount>0){
                    result = result - Integer.parseInt(String.valueOf(sb));
                    sb.setLength(0);
                }else {
                    result = result + Integer.parseInt(String.valueOf(sb));
                    sb.setLength(0);
                }
                mCount++;
            }else{
                sb.append(expression.charAt(i));
                if(i == expression.length()-1){
                    if(mCount > 0){
                        result = result - Integer.parseInt(String.valueOf(sb));
                    }else{
                        result = result + Integer.parseInt(String.valueOf(sb));
                    }
                }
            }
        }
        System.out.println(result);

    }
}
