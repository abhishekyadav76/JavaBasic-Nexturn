package DAY6;

public class ConstructEx{

    int num;
    String name;
  
    //a constructor is a special method that a used to insitaklised
    //it is automatically create when object is called
    //1.same name as class
    //2.no return type
    //3.called automaticlly
    // 4.parametrized
    // 5.overloading is possible
    //6. default constructor and parametrized constructor
    ConstructEx(){
        //default Constructor
        int num = 40;
        String name = "Abhishek";
        System.out.println("default constructor");
    }
    //parametrized constructor
    ConstructEx(String name,int num){
        this.name=name;
        this.num=num;
        
 }
    
    void Show(){
        System.out.println("num = "+num);
        System.out.println("name = "+name);
    }


    public static void main(String[] args) {
        // int a ;
        // System.out.println(a);
        ConstructEx obj  = new ConstructEx();
        ConstructEx obj1 = new ConstructEx("Anoop", 40);
        obj.Show();
        obj1.Show();


    }



}
