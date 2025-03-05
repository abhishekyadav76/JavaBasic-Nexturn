package Day4;

import java.util.Arrays;

public class ArrayPratices {
    public static void main(String[] args) {
        //declaration
        //int[] arr = new int[5];
        //initialization
        int[] arr1 = {1, 2, 3, 4, 5};

        //accessing
        //System.out.println(arr[0]);

        //traversing 
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }

        //using for each loop
        System.out.println("using for each loop: ");
        for(int i:arr1)
        {
            System.out.println(i);
        }


        //Function in array
         int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        
        int[] arr2 = {5, 3, 8, 1, 9};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2)); 

        int[] arr3 = new int[5];
        Arrays.fill(arr3, 7);
        System.out.println(Arrays.toString(arr3)); 

        int[] arr4 = {1, 2, 3};
        int[] newArr = Arrays.copyOf(arr4, 5); 
        System.out.println(Arrays.toString(newArr)); 
        
        int[] arr5 = {10, 20, 30, 40, 50};
        int[] subArray = Arrays.copyOfRange(arr5, 1, 4); 
        System.out.println(Arrays.toString(subArray)); 

        int[] arr6 = {1, 2, 3};
        int[] arr7 = {1, 2, 3};
        System.out.println(Arrays.equals(arr6, arr7)); 

        int[] arr8 = {1, 3, 5, 7, 9};
        int index = Arrays.binarySearch(arr8, 5);
        System.out.println(index);

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(matrix)); 

        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println(Arrays.asList(names));

    }
}
