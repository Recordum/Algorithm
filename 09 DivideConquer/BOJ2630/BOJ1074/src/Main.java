import java.io.*;
import java.util.*;


public class Main {

    static int number = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int length = (int) Math.pow(2,n);

        divConquer(length,r, c,0,0);
        System.out.println(number);


    }

    private static void divConquer(int length, int rows , int column,int startRows, int startColumn) {
       if(length < 2) {
            return;
       }else{
           if(rows <= startRows + length/2 -1  && column <= startColumn + length/2 -1){
               divConquer(length / 2, rows, column,  startRows, startColumn);
           }
           if(rows <= startRows + length/2 -1 && column > startColumn +length/2 -1){
               number = number + (int)Math.pow(length/2 , 2);
               divConquer(length/2, rows, column,  startRows, startColumn + length/2 );
           }
           if(rows > startRows + length/2 -1 && column <= startColumn +length/2 -1) {
               number = number + 2 *(int)Math.pow(length/2 , 2);
               divConquer(length / 2, rows, column,  startRows + length/2 ,startColumn);
           }
           if(rows > startRows + length/2 -1 && column > startColumn + length/2 -1) {
               number = number + 3 *(int)Math.pow(length/2 , 2);
               divConquer(length / 2, rows, column,startRows + length/2 ,startColumn + length/2);
           }
       }

    }
}
