package ProtectedAccessModifier.AnotherPriotectedAccessModifier;

import ProtectedAccessModifier.Parent;

public class Child extends Parent {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println("In another Package");
        obj.show(); 
    }
}
