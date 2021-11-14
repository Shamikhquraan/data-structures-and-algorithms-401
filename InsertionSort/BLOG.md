## InsertionSort challange :

I**nsertionSort method** , return will be the sorted array. and there are cases for inserting empty array and if size of array is one also if there is repeate values but in genrall it will sort any given array .

## PseudoCode:

 InsertionSort(int[] arr)

    FOR i = 1 to arr.length

      int j <-- i - 1
      int temp <-- arr[i]

      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1

      arr[j + 1] <-- temp 

 
  ## Visualization the method :

  ![](code16.png)

  - Since 7 is the first element has no other element to be compared with, it remains at its position. Now when on moving towards 4,7  is the largest element in the sorted list and greater than 4. So, move 4 to its correct position i.e. before 7. Similarly with 5, as 7 (largest element in the sorted list) is greater than 5, we will move 5 to its correct position. Finally for 2, all the elements on the left side of 2 (sorted list) are moved one position forward as all are greater than 2 and then 2 is placed in the first position. Finally, the given array will result in a sorted array.

## Time Complexity:

- In worst case,each element is compared with all the other elements in the sorted array. For N elements, there will be  N^2 comparisons. Therefore, the time complexity is O(N^2).

