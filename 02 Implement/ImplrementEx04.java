import java.util.Scanner;

public class ImplrementEx04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int n  = scanner.nextInt();
       int m = scanner.nextInt();
       int x = scanner.nextInt();
       int y = scanner.nextInt();
       int dir = scanner.nextInt();
       boolean finish = true;
       int array[][] = new int[n][m];

       for( int i = 0; i<n ; i ++){
           for( int j = 0; j<m ; j++){
               array[i][j] = scanner.nextInt();
           }
       }
        int dx[] = {0 , -1, 0, 1};
        int dy[] = {-1 , 0, 1, 0};

        int count = 1;
        int finishCount = 0;
        int flag = 2;

        while(finish){
            if(dir >= 4) {dir = 0;}

            if(finishCount == 4) {
               x = x - dx[dir];
               y = y - dy[dir];
               if( x < 0 || y<0 || y > n-1 ||x > m-1 || array[y][x] == 1 ){
                   x = x + dx[dir];
                   y = y + dy[dir];
               }

               finish = false;

            }
            array[y][x] = flag;
            x = x + dx[dir];
            y = y + dy[dir];

            if ( x < 0 || y<0 || y > n-1 ||x > m-1 || array[y][x] == flag|| array[y][x] == 1 ) {
                x = x - dx[dir];
                y = y - dy[dir];
                dir++;
                finishCount++;
                continue;
            }
            dir++;
            count++;
            finishCount = 0;
        }
        System.out.println(count + " (" + y + ", " + x + ")");
    }
}
