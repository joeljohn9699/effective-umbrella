// multilevel inheritance demo.

class InheritanceA{
    float r, result;
    final float pi = 22/7f;
    void circleArea(float rad){
        System.out.println("Method to print area of a circle");
        r = rad;
        result = pi * r * r;
        System.out.println("Area of circle is " +result);
    }
}   

class InheritanceB extends InheritanceA{
    float l, b, result;
    void rectangleArea(float length, float breadth){
        System.out.println("Method to print area of a rectangle");
        l = length;
        b = breadth;
        result = l * b;
        System.out.println("Area of rectangle is " +result);
    }
}

class InheritanceC extends InheritanceB{
    float b, h, result;
    void triangleArea(float breadth, float height){
        System.out.println("Method to print area of a triangle");
        b = breadth;
        h = height;
        result = 0.5f * b * h;
        System.out.println("Area of triangle is " +result);
    }

    public static void main(String[] args) {
        InheritanceC obj = new InheritanceC();
        obj.circleArea(25f);
        obj.rectangleArea(25f,10f);
        obj.triangleArea(25f,10f);
    }
}