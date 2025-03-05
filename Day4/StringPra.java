package Day4;

public class StringPra {
    public static void main(String[] args) {
        // String str = "Hello, World!";
        //  System.out.println(str);
        //  str = str+"Abhishek";
        //  System.out.println(str);
         

         //String Bulider
         StringBuilder name =  new StringBuilder("Aur Bhai ");
         name.append("welcome");//editing the existing memory
         System.out.println(name);

         name.insert(2,"Zamin");
         System.out.println("insert: "+name);

         name.replace(0, 5, "faraan");
         System.out.println("Replace: " +name);

         name.delete(0, 5);
         System.out.println("Deleted: "+name);

         name.reverse();
         System.out.println("reverse: "+name);

         int len = name.length();
         System.out.println("Lenghth: "+len);

         char ch = name.charAt(6);
         System.out.println("CharAt : "+ch);

         name.setCharAt(5, 'P');
         System.out.println("Set Char: "+name);




    }
}
