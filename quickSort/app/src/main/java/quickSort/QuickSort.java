package quickSort;

public class QuickSort {
    public  int[] sortArr(int[] arr){
        int left = 0;
        int right = arr.length -1;
        return quickSort(arr, left, right);
    }
    public  int[] quickSort(int[] arr, int left, int right){
        if(left < right ){
            int position = partition(arr, left,right);
            quickSort(arr, left, position -1 );
            quickSort(arr,position +1, right );
        }
        return arr;
    }

    private  int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int low = left-1 ;
        int i;
        for( i = left; i< right; i++){
            if(arr[i] <= pivot){
                low++;
                swap(arr, low, i);
            }
        }
        swap(arr, low+1, right);
        return low+1;
    }

    private  void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first]  = arr[second];
        arr[second] = temp;
    }
}