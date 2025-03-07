package DAY7;

interface Students{
    void speak();
}

class teacher implements Students{
    public void speak(){
        System.out.println("teacher Speak");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        teacher t = new teacher();
        t.speak();
    }
}

