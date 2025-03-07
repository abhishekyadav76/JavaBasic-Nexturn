package DAY7;


abstract class Database{
    abstract void connecting();
    void disconnect(){
        System.out.println("Dissconnected");
    }
}

class Mydata extends Database{
    void connecting(){
        System.out.println("connecting to Database");
    }
}

public class Abstract2Ex {

    public static void main(String[] args) {
        Mydata mt = new Mydata();
        mt.connecting();
        mt.disconnect();
    }

}

