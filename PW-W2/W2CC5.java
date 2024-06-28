//Interchanging numbers logic

class W2CC5{
    public static void main(String[] args) {
        int a = 10, b = 15;

        System.out.println("The  numbers before interchanging:");
        System.out.println(a);
        System.out.println(b);

        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("The numbers after interchanging:");
        System.out.println(a);
        System.out.println(b);        

    }
}