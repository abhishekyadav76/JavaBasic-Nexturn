package DAY6;

class Student{
    void speak(){
        System.out.println("Student Speak ");
    }
}
class Teacher extends Student{
    void teach(){
        System.out.println("Teacher teach");
        }   
}

public class InheritanceEx {
    public static void main(String[] args) {
        Teacher th = new Teacher();
        th.teach();
        th.speak();
    }
}
