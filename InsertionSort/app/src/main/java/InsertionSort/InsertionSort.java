package InsertionSort;


public class InsertionSort {
    public static int[] insertSort(int[] Arr){
        if(Arr.length <=1) {return Arr;};
        int num;
        for(int i = 1 ; i< Arr.length; i++){
            int temp = Arr[i];
            for ( num = i-1; num>=0 && temp < Arr[num]; num--){
                Arr[num+1] = Arr[num];
            }
            Arr[num+1] = temp;
        }
        return Arr;
    }
}