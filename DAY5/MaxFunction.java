package DAY5;

import java.util.Scanner;

public class MaxFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int maxium = maxi(a,b);
        System.out.println("Maximum Of two number is : "+maxium);
    }

    static int maxi(int a, int b) {
        if (a > b) {
            return a;
            }
        else {
            return b;
            }
    }
}
