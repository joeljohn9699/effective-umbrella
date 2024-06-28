import java.util.Scanner;

class patternTest{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the input:");
        int indexOfStar = in.nextInt();

        for (int i = indexOfStar; i > 0; i--){
            for (int j = i; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println("\n");
        } in.close();
    }
}