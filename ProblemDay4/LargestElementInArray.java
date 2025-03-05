package ProblemDay4;

public class LargestElementInArray {

    public static void main(String[] args) {
        int[] array = {78,56,8,900,56,145,568,479,423,1000};
        int max = array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max = array[i];
            }
        }
        System.out.println("Largest element in array is: "+max);
    }
    
}
