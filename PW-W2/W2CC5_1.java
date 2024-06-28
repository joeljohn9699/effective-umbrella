//Interchanging numbers logic

import java.util.Scanner;
class W2CC5_1{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the numbers:");
        int a= in.nextInt();
        int b = in.nextInt();
        in.close();
        System.out.println("The numbers before interchanging:");
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