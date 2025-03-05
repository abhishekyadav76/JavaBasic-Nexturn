package DAY5;

public class RecursionEx {
    public static int factorial(int num)
    {
        if(num==0)
        {
            return 1;
        }
            return num * factorial(num-1);
        
    }

    public static void PrintNumber(int n)
    {
        if(n==0)
        return;

        PrintNumber(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is: " + factorial(num));
        PrintNumber(5);
    }
}
