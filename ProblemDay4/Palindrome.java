package ProblemDay4;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A string: ");
        String str = sc.nextLine();
        int n = str.length();
        int i = 0;
        int j = n - 1;
        boolean flag = true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) 
            {
                flag = false;
                break;
            }
            i++;
            j--;
            }
            if (flag) {
                System.out.println("The string is a palindrome");
            } else {
                 System.out.println("The string is not a palindrome");
            }


    }
    
}
