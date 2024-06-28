//Run Time Polymorphism

class A{
    public void car(){
        System.out.println("I am method A.");
    }
}

class B extends A{
    public void car(){
        System.out.println("I am method B.");
    }
}

public class W2CC12{
    public static void main(String[] args) {
        A obj = new A();
        obj.car();
        A obj1 = new B();
        obj1.car();

    }
}