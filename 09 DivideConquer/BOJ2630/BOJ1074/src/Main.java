import java.io.*;
import java.util.*;


public class Main {
    static int[][] field;
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int length = (int) Math.pow(2,n);
        field = new int[length][length];

        divConquer(length,r, c,0,0);


        System.out.print(field[r][c]);

    }

    private static void divConquer(int length, int rows , int column,int startRows, int startColumn) {
       if(length < 2) {
            return;
       }else{
           if(rows <= startRows + length/2 -1  && column <= startColumn + length/2 -1){
               divConquer(length / 2, rows, column,  startRows, startColumn);
           }
           if(rows <= startRows + length/2 -1 && column > startColumn +length/2 -1){
               field[startRows][startColumn+length/2] = field[startRows][startColumn] + (int)Math.pow(length/2, 2);
               divConquer(length/2, rows, column,  startRows, startColumn + length/2 );
           }
           if(rows > length/2 -1 && column <= length/2 -1) {
               field[startRows+length/2][startColumn] = field[startRows][startColumn] + 2*(int)Math.pow(length/2, 2);
               divConquer(length / 2, rows, column,  startRows + length/2 ,startColumn);
           }
           if(rows > length/2 -1 && column > length/2 -1) {
               field[startRows+length/2][startColumn+length/2] = field[startRows][startColumn] + 3*(int)Math.pow(length/2, 2);
               divConquer(length / 2, rows, column,startRows + length/2 ,startColumn + length/2);
           }
       }

    }
}
