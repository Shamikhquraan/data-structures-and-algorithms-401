/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package InsertionSort;
import java.util.Arrays;
public class App {
    public static void main(String[] args) {
        int[] Arr1 = {9,50,3,1,19,27};
        int[] Arr2 = {20,33,12,8,46,-8};
        int[] Arr3 = {6,22,6,13,5,6};
        System.out.println("Array1 insertion sort is :"+Arrays.toString(InsertionSort.insertSort(Arr1)));
        System.out.println("Array2 insertion sort is :"+Arrays.toString(InsertionSort.insertSort(Arr2)));
        System.out.println("Array3 insertion sort is :"+Arrays.toString(InsertionSort.insertSort(Arr3)));
    }
}