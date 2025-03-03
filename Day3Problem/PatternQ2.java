package Day3Problem;

import java.util.Scanner;

public class PatternQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number : ");
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();

        }

    }
    
}
