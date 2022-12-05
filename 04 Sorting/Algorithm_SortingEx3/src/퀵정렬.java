public class 퀵정렬 {
    public static void quickSort(int[] array, int start, int end){
        if(start <= end){
            return;
        }
        int pivot = start;
        int left = start +1;
        int right = end;
        while(left<= right){
            while(left <= end && array[left] <= array[pivot]){
                left++;
            }
            while(right > start && array[right] >= array[pivot]){
                right --;
            }
            if (left > right) {
                int temp = array[pivot];
                array[pivot] = array[right];
                array[right] = temp;
            }else {
                int temp = array[right];
                array[right] = array[left];
                array[left] = temp;
            }
        }
        quickSort(array,start, right-1);
        quickSort(array, right+1, end);
    }
    public static void main(String[] args) {
        int [] array = {1, 2, 5, 4 ,3};
        quickSort(array, 0, array.length -1);
    }
}
