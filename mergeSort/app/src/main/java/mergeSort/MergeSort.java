package mergeSort;

import java.util.Arrays;

public class MergeSort {
    public void mergeSort(int[] sortArr){
        int num = sortArr.length;
        if(num>1){
            int mid = num/2 ;
            int[] left= Arrays.copyOfRange(sortArr,0,mid) ;
            int[] right = Arrays.copyOfRange(sortArr,mid,num);
            mergeSort(left);
            mergeSort(right);
            merge(left ,right,sortArr);
        }
    }

    public void merge(int[] left , int[] right , int[] arr){
        int i =0 ;
        int j =0 ;
        int k =0 ;
        while (i<left.length && j <right.length){
            if (left[i] <right[j])
            { arr[k] =left[i];
                i++; }
            else {
                arr[k] = right[j];
                j++;
            }
            k++; }
        while (i< left.length){
            arr[k]=left[i];
            i++; k++;
        }
        while (j<right.length){
            arr[k]=right[j];
            j++; k++; }
    } }
