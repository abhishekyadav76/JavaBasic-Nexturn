package NestedLoop;

import java.util.Scanner;

public class Problem3 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number: ");
        int n = sc.nextInt();
        
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            System.out.println(i +" "+j);
        }
    }
}

}
