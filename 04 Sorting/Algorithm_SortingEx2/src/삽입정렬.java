public class 삽입정렬 {
    public static void main(String[] args) {
        int[] array = {7,6,9,0,3,1,6,2,4,8};
        int n = 10;

        for(int i = 1 ; i < n ; i++){
            for(int j = i ; j> 0 ; j--){
                if(array[j] < array[j-1]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                } else{
                    break;
                }
            }

        }
    }
}
