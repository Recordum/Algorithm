import java.lang.reflect.Field;
import java.util.*;
import java.io.*;

public class Main {
    static int[][] paper;
    static int countPlus;
    static int countZero;
    static int countMinus;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        paper = new int[n][n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n ; j++){
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dividedConquer(0, 0, n);

        System.out.println(countMinus);
        System.out.println(countZero);
        System.out.println(countPlus);
    }

    private static void dividedConquer(int startRow, int startColumn, int size) {
        if(!search(startRow, startColumn, size)){
            dividedConquer(startRow,startColumn,size/3);
            dividedConquer(startRow+size/3, startColumn, size/3);
            dividedConquer(startRow+2*size/3, startColumn, size/3);
            dividedConquer(startRow, startColumn+size/3, size/3);
            dividedConquer(startRow, startColumn+2*size/3, size/3);
            dividedConquer(startRow+size/3, startColumn+size/3, size/3);
            dividedConquer(startRow+size/3, startColumn+2*size/3, size/3);
            dividedConquer(startRow+2*size/3, startColumn+size/3, size/3);
            dividedConquer(startRow+2*size/3, startColumn+2*size/3, size/3);
        }
    }

    private static boolean search(int startRow, int startColumn , int size) {
        int compare = paper[startRow][startColumn];

        for(int i = startRow ; i < startRow + size ; i++){
            for(int j = startColumn; j < startColumn + size ; j++){
                if(i == startRow && j == startColumn){
                    continue;
                }
                if(compare != paper[i][j]){
                    return false;
                }
            }
        }
        if(compare ==1){
            countPlus++;
            return true;
        }
        if(compare == 0){
            countZero++;
            return true;
        }
        if(compare == -1){
            countMinus ++;
            return true;
        }
        return true;
    }

}