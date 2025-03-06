package DAY6;

class Principal{
    void speak(){
        System.out.println("Principal speak:");
    }

}

class Teachers extends Principal{
    void teach(){
        System.out.println("Teacher teach");
    }
}

class students extends Teachers
{
    void fight(){
        System.out.println("Student fight");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        students st = new students();
        st.fight();
        st.speak();
        st.teach();
    }
    
}
