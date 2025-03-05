package ProblemDay4;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrayOrNot {
    public static void main(String[] args) {
        // int[] arr1 = {1, 2, 3, 4, 5};
        // int[] arr2 = {1, 2, 3, 4, 5};
        // System.out.println(Arrays.equals(arr1, arr2));


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        boolean isEqual = true;
        if (n1 != n2) {
            isEqual = false;
        } else {
            for (int i = 0; i < n1; i++) {
                if (arr1[i] != arr2[i]) {
                    isEqual = false;
                    break;
                }
            }
        }

        if (isEqual) {
            System.out.println("The two arrays are equal.");
        } else {
            System.out.println("The two arrays are not equal.");
        }

                

    }
    
}
