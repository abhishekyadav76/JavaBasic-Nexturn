package DAY5;

public class ReverseStringRecursion {

    public static String ReverseString(String str)
    {
        if(str.length()==0)
        {
            return "";
        }else{
             return ReverseString(str.substring(1))+str.charAt(0);
        }
    }
    public static void main(String[] args) {
        String str = "Abhishek";
        System.out.println("Original String: "+str);
        System.out.println("REverse A string: --> "+ReverseString(str));

    }
}
