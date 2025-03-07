package DAY7;

abstract class Trainer{
    abstract void Teach();
    //abstarct dont have implemention deatils
}

class Stud extends Trainer{
    void Teach(){
        System.out.println("training is going on");
    }
}

public class AbstractEx {
    public static void main(String[] args) {
        Stud st  = new Stud();
        st.Teach();
    }

}

