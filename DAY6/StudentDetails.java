package DAY6;

class StudentEx{

    String Str;
    int rollno;
    Character ch;

    StudentEx(String Str,int rollno,Character ch)
    {
        this.Str = Str;
        this.rollno = rollno;
        this.ch = ch;

    }

    void display(){
        System.out.println("Name: "+Str);
        System.out.println("Roll No: "+rollno);
        System.out.println("Grade: "+ch);
    }

}

public class StudentDetails {
    public static void main(String[] args) {
        StudentEx s1 = new StudentEx("Rahul", 1, 'A');
        s1.display();
        
    }
}
