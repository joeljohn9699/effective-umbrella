import java.util.Scanner;

class palindromeTest {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number:");
        int initialNo = in.nextInt();
        int remain,number = initialNo,reverse = 0;
        
        while (number != 0){
            remain = number % 10;
            reverse = (reverse * 10) + remain;
            number = number / 10;
        }
        System.out.println("the reverse number is :" +reverse);
        in.close();

        if (reverse == initialNo){
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }
}