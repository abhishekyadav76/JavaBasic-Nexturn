

class PrivateEx{
   private int secretcode=1245;

   void showcode(){
    System.out.println(secretcode);
   }
}


public class PrivateAcessModifier{
    public static void main(String[] args) {

        // System.out.println(secretcode);
        PrivateEx obj = new PrivateEx();
        obj.showcode();
        
    }
}