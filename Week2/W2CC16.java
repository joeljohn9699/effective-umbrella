class W2CC16{

    void method1(String a){
        System.out.println("I am from method without return type and an input argument.");
    }

    void method1(){
        System.out.println("I am from method without return type.");
    }

    String method2(String a){
        return ("I am from method with return type and an input argument.");
    }

    String method2(){
        return ("I am from method with return type.");
    }

    public static void main(String[] args) {
        W2CC16 obj = new W2CC16();
        obj.method1("Test String");
        obj.method1();
        System.out.println(obj.method2());
        System.out.println(obj.method2("String Test"));
        System.out.println("Method Overloading is used.");
    }
}