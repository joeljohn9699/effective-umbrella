//demo for final keyword.

class Area{
    final float pi = 3.14f;
    int r;

    float area(){
        return pi * r * r;
    }

    public static void main(String[] args) {
        Area obj = new Area();
        obj.r = 2;
        System.out.println("The area of circle is: " +obj.area());
    }
}