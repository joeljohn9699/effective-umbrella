//Variable value input from user

import java.util.Scanner;

class W3CC1{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the integer value:");
        int a = in.nextInt();
        System.out.println("Enter the float value:");
        float b = in.nextFloat();
        System.out.println("Enter the Double value:");
        double c = in.nextDouble();
        System.out.println("Enter the Boolean value:"); 
        boolean d = in.nextBoolean();
        System.out.println("Enter the Character value:");
        char e = in.next().charAt(0);
        in.close();

        System.out.println("The integer value is:" +a);
        System.out.println("The Float value is:" +b);
        System.out.println("The Double value is:" +c);
        System.out.println("The Boolean value is:" +d);
        System.out.println("The Character value is:" +e);
                
    }
}