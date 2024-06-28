//Default constructor and parameterized constructor

class ConstructorDemo1 {
    ConstructorDemo1(){
        System.out.println("My name is Joel John.");
    }
    ConstructorDemo1(int age, String city){
        System.out.println("My age is " + age + " and I am from " + city);
    }

    public static void main(String[] args) {
        //Method 1 of calling constructors
        ConstructorDemo1 obj = new ConstructorDemo1();
        ConstructorDemo1 obj1 = new ConstructorDemo1(23,"Ernakulam");
        System.out.println("The constructors are invoked and printed.");
        System.out.println(obj); // Identity Hash-map
        System.out.println(obj1); // Identity Hash-map
    }
}