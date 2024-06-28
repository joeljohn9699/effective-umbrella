//Basic calculator using switch

import java.util.Scanner;

class W3CC5{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the numbers:");
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("Choose the option:");
        System.out.println("1 -> Addition");
        System.out.println("2 -> Subtraction");
        System.out.println("3 -> Multiplication");
        System.out.println("4 -> Division");
        int c = in.nextInt();

        switch (c) {
            case 1: System.out.println(a + b); break;
            case 2: System.out.println(a - b); break;
            case 3: System.out.println(a * b); break;
            case 4: if ( b != 0){ System.out.println(a / b); }
            else { System.out.println("Cannot be divided"); } break;
            default:System.out.println("Not a valid option"); break;
        }
        in.close();
    }
}