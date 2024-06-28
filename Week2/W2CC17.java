class Method{
    int x, y;

    int performLeftShift(){
        y = (x << 1);
        return y;
    }

    void performRightShift(int val, int digitToShift){
        x = digitToShift;
        y = val;
        y = (x >> 1);
        System.out.println("Right Shift:" +y);
    }

    public static void main(String[] args) {
        Method obj = new Method();
        obj.performRightShift(10, 100);
        System.out.println("Left Shift:" +obj.performLeftShift());

    }
}