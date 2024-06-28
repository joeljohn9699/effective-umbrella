//Default constructor and parameterized constructor

class ConstructorDemo2{
    public ConstructorDemo2(){
        System.out.println("I am default constructor.");
    }
    public ConstructorDemo2(int a, float b, String c, char d){
        System.out.println("I am Parameterized constructor. I take various arguments as input.");
        System.out.println("The square of integer is: " + a * a);
        System.out.println("The square of float is: " + b * b);
        System.out.println("The String is: " + c);
        System.out.println("The Character is: " + d);
    }
    void observations(){
        System.out.println("Inside observations method.");
    }

    public static void main(String[] args) {
        //Method 2
        ConstructorDemo2 obj2, obj3;
        obj2 = new ConstructorDemo2();
        obj3 = new ConstructorDemo2(52, 32.8f, "Double Test", 'D');
        obj2.observations();
        System.out.println(obj2); //Identity Hash-Map
        System.out.println(obj3); //Identity Hash-Map
    }
}