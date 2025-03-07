package DAY7;

//hiding fields and methods
// controlled access
class encpClass{
    private String name;

    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }

}

public class EncapEx {
    public static void main(String[] args) {
        encpClass obj = new encpClass();
         obj.setname("Abhishek");
         System.out.println(obj.getname());
    }
    
}
