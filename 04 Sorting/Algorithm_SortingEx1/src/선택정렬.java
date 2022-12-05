public class 선택정렬 {
    public static void main(String[] args) {
        int[] array = {7, 5, 3, 2, 1, 4, 6, 9, 8, 0};
        int n = 10;

        for(int i = 0 ; i < n ; i++){
            int min_index = i;
            for(int j = i +1 ; j < n ; j++){

                if(array[min_index] > array[j]){

                    min_index = j;

                }
            }
            int temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;
        }

    }
}
