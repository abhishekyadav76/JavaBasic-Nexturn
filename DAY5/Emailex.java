package DAY5;

public class Emailex {

    public static void sendmail(String name,String company)
    {
        String emaildraft = "Dear " + name + " Welcome to " + company + " Thank you for your interest";
        System.out.println(emaildraft);
    }
    public static void main(String[] args) {
        sendmail("Abhishek", "Nexturn");
    
    }
    
}
