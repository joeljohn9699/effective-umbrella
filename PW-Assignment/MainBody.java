import java.util.Scanner;

class MainBody{
    public static void main(String[] args) {
        int choice;
        Scanner in = new Scanner (System.in);
        
        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Find palindrome of number.");
            System.out.println("2. Print Pattern for a given no.");
            System.out.println("3. Check whether the no is a  prime number.");
            System.out.println("4. Print Fibonacci series.");
            System.out.println("0. Exit");

            choice = in.nextInt();
            
            switch (choice) {
                case 0: break;
                case 1: System.out.println("Function to print palindrome."); break;
                case 2: System.out.println("Function to print pattern."); break;
                case 3: System.out.println("Function to print prime."); break;
                case 4: System.out.println("Function to print fibonacci."); break;
            
                default: System.out.println("Invalid choice."); break;
            }
            
        } while (choice != 0);{
            System.out.println("Exit Succesfull");
        }
        in.close();
    }
}