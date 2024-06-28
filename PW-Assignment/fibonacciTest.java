import java.util.Scanner;

class fibonacciTest{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the count:");
        int count = in.nextInt();
        int calSum = 0, i = 0, j = 1;
        System.out.print(+i +" " +j +" ");

        for (int k = 2; k < count; k++){
            calSum = i + j;
            System.out.print(calSum +" ");
            i = j;
            j = calSum;
        } System.out.println(); 
        in.close();
    }
}