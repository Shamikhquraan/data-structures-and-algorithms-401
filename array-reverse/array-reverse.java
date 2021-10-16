public static void main(String[] args)
    {
        int [] array = {1, 2, 3, 4, 5, 6};
        reverse(array, array.length);
    }

    static void reverse(int arr[],int size){

        int[] newArr= new int[size];
        int sizeArr= size;
        for (int i=0;i < size; i++){


            newArr= [sizeArr-1]=arr[i];
            sizeArr=sizeArr-1;
        }

        System.out.println("Reversed Array is:");
        for(int k = 0; k < size ; k++){ 
        
        System.out.println(newArr[k]);
        }
}