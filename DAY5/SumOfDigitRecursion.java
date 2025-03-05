package DAY5;

public class SumOfDigitRecursion {

    static int sumOfDigit(int n) {
        int sum = 0;
        if (n == 0) {
            return 0;
            }
            else {
                 sum = n%10 + sumOfDigit(n/10);
                     return sum;
                }
        }

    public static void main(String[] args) {
        int num = 4567;
        System.out.println("Sum of Digit is : "+sumOfDigit(num));
        
    }
}
