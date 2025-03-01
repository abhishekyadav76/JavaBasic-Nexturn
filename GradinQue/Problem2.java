package GradinQue;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter student's marks (0-100): ");
         int marks = sc.nextInt();

         String grade;
         switch (marks / 10) {  
             case 10: 
             case 9:
                 grade = "A";
                 break;
             case 8:
                 grade = "B";
                 break;
             case 7:
                 grade = "C";
                 break;
             case 6:
                 grade = "D";
                 break;
            case 5:
                 grade="E";
                 break;
             default:
                 grade = "Fail";
                 break;
         }
 
         System.out.println("Grade: " + grade);

       
    }
}
