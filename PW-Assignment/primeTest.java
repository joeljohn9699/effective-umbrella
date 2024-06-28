import java.util.Scanner;

class primeTest{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number:");
        int number = in.nextInt(); boolean isPrime = true;

        if (number == 0) System.out.println("Invalid.");
        else if (number == 1) System.out.println("1 is neither prime nor composite");
        else if (number == 2) System.out.println("The number is prime.");
        else if (number >= 3) {
            for (int i = 2; i < number; i++){
                if (number % i == 0) {
                    System.out.println("The number is not a prime.");
                    isPrime = false;
                    break;
                }
                }if (isPrime == true) {
                    System.out.println("The number is prime.");
            }
        } in.close();
    }
}