package DAY5;

import java.util.Scanner;

public class FacbonnaicSeries {

    public static int Facbo(int n) {
        if(n==0) return 0;
        if(n<=1)
        {
            return 1;
        }
        else{
            return Facbo(n-1) + Facbo(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("The Fibonacci series is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(Facbo(i)+" ");
        }

    }
    
}
