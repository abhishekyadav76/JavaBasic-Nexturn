package Day4;

import java.util.Scanner;

public class AtmPin {
    public static void main(String[] args) {
        int pin = 1245;
        int n = 3;
        int i=1;
        while(i<=n)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your pin: ");
            int userPin = sc.nextInt();
             if(userPin==1245)
             {
                System.out.println("Welcome BRo You are the Genious");
                return;

             }else{
                if(i==3)
                {
                    System.out.println("Account Locked Please Try after 72hours");
                }else{
                    System.out.println("Invalid Pin Please Try Again");
                }
             }
             i++;
        }
    }
}
