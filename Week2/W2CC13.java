// method overloading / compile time polymorphism / static binding method.

class W2CC13{
    int length, breadth, height, area;
    void findArea(int a, int b){
        length = a;
        breadth = b;
        area = length * breadth;
        System.out.println("The area of rectangle is " +area);
    }

    void findArea(int a, int b, int c){
        length = a;
        breadth = b;
        height = c;
        area = length * breadth * height;
        System.out.println("The area of rectangular cuboid is " +area);
    }

    public static void main(String[] args) {
        W2CC13 obj = new W2CC13();
        obj.findArea(25, 23, 21);
        obj.findArea(25, 23);
    }
}