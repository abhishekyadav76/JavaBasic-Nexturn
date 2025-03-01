package ActivityQuestionProblem1;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter Activity: ");
         String activity = sc.nextLine().toLowerCase(); 
         
         System.out.print("Enter Duration (min): ");
         double duration = sc.nextDouble(); 
 
        
         double metValue;
 
         switch (activity) {
             case "running":
                 metValue = 10.0;
                 break;
             case "cycling":
                 metValue = 8.0;
                 break;
             case "swimming":
                 metValue = 9.8;
                 break;
             case "weightlifting":
                 metValue = 3.5;
                 break;
             case "yoga":
                 metValue = 2.5;
                 break;
             case "jump rope":
                 metValue = 12.0;
                 break;
             case "walking":
                 metValue = 3.3;
                 break;
             case "hiit":
                 metValue = 11.0;
                 break;
             case "dancing":
                 metValue = 5.0;
                 break;
             case "basketball":
                 metValue = 8.0;
                 break;
             case "pilates":
                 metValue = 3.0;
                 break;
             case "rock climbing":
                 metValue = 7.5;
                 break;
             case "hiking":
                 metValue = 6.5;
                 break;
             case "kickboxing":
                 metValue = 7.0;
                 break;
             case "rowing":
                 metValue = 7.5;
                 break;
             case "elliptical training":
                 metValue = 7.0;
                 break;
             case "zumba":
                 metValue = 6.5;
                 break;
             default:
                 System.out.println("Activity not found. Please enter a valid activity.");
                 return; 
         }
 
         double caloriesBurned = metValue * duration;
 
         System.out.println("Calories Burned: " + Math.round(caloriesBurned)); 
 

    }
 }

