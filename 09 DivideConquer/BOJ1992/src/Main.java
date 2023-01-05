import java.util.*;
import java.io.*;


public class Main {
    static int[][] video;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        video = new int[n][n];
        for(int i = 0 ; i< n ; i++){
            String input = br.readLine();
            for(int j = 0; j<n ; j++){
                video[i][j] = Integer.parseInt(String.valueOf(input.charAt(j)));
            }
        }

        dividedConquer(0,0, n);
        System.out.println(sb);

    }

    private static void dividedConquer(int rows, int column, int size) {

        if(!search(rows,column,size)){
            sb.append("(");
            dividedConquer(rows,column,size/2);
            dividedConquer(rows,column+size/2,size/2);
            dividedConquer(rows+size/2,column,size/2);
            dividedConquer(rows+size/2,column+size/2,size/2);
            sb.append(")");
        }

    }

    private static boolean search(int rows, int column, int size) {
        int compare = video[rows][column];

        for(int i = rows ; i < rows + size ; i++){
            for(int j = column; j< column + size ; j++){
                if(i == rows && j ==column){
                    continue;
                }
                if(compare != video[i][j]){
                    return false;
                }
            }
        }

        if(compare == 1){
            sb.append(1);
            return true;
        }
        if(compare == 0){
            sb.append(0);
            return true;
        }

        return true;
    }
}
