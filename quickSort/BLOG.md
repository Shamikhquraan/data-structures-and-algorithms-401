## Quick Sort :

Quick Sort is the act of sorting a list of items by picking 1 item as a pivot and comparing it to the rest of the items. Each time an item is less than the pivot we swap locations with a known larger item.

## Pseudo Code:

ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right.
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp




## solution :

![](Whiteboard(1).png)


## Code :


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




## Tests:

class AppTest {
    @Test void quickSortTest(){
        int arr[] = {8,4,23,42,16,15};
        QuickSort quickSort=new QuickSort();
        quickSort.sortArr(arr);
        String res= Arrays.toString(arr);
        assertEquals("[4, 8, 15, 16, 23, 42]",res);
    }
}


## Edge cases:
- Array is empty.
- All nums are equal.

## Big(O):
- O(1) for space O(nlogn) in worst case.