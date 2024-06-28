import java.util.Scanner;

class Assignment{
    Scanner in = new Scanner (System.in);

    public void palindrome(){
        System.out.println("Enter the number:");
        int initialNo = in.nextInt();
        int remain,number = initialNo,reverse = 0;
                    
        while (number != 0){
            remain = number % 10;
            reverse = (reverse * 10) + remain;
            number = number / 10;
        }
        System.out.println("the reverse number is :" +reverse);
               
        if (reverse == initialNo){
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        } 
    }
    
    public void pattern(){
        System.out.println("Enter the input:");
        int indexOfStar = in.nextInt();
    
        for (int i = indexOfStar; i > 0; i--){
            for (int j = i; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    public void prime(){
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
            } if (isPrime == true) {
                System.out.println("The number is prime.");
            }
        }
    }

    public void fibonacci(){
        System.out.println("Enter the count:");
        int count = in.nextInt();
        int calSum = 0, i = 0, j = 1;
        System.out.print(+i +" " +j +" ");

        for (int k = 2; k < count; k++){
            calSum = i + j;
            System.out.print(calSum +" ");
            i = j;
            j = calSum;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Assignment obj = new Assignment();
        int choice;
        Scanner in = new Scanner (System.in);
                
        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Check for palindrome number.");
            System.out.println("2. Print pattern of stars in decreasing order based on the input.");
            System.out.println("3. Check whether the input number is a prime number.");
            System.out.println("4. Print Fibonacci series of input count.");
            System.out.println("0. Exit");
            choice = in.nextInt();
                    
            switch (choice) {
                case 0: break;
                case 1: obj.palindrome(); break;
                case 2: obj.pattern(); break;
                case 3: obj.prime(); break;
                case 4: obj.fibonacci(); break;
                    
                default: System.out.println("Invalid choice."); break;
            }
                    
        } while (choice != 0);{
                System.out.println("Exit Succesfull");
            }
        in.close();
    }
}