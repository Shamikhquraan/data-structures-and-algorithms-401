import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        int num = 16;
        int [] arr = { 42, 8, 15, 23, 42 };
        System.out.println(Arrays.toString(arr));
        arr = insertShiftArray(num, arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] insertShiftArray(int num, int arr[]) {

        int [] newArr = new int[arr.length+1];
        int middleNum = Math.abs(arr.length / 2);

        for (int i = 0; i < arr.length+1; i++) {
            if (i < middleNum ) {
                newArr[i] = arr[i];
            }
            if (i == middleNum ) {
                newArr[i] = num;
            } else if (i > middleNum ) {
                newArr[i] = arr[i - 1];
            }
        }
        return newArr;

    }}