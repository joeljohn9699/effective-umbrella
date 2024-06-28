//Nested Else If demo

class W2CC4{
    public static void main(String[] args) {
        long year = 1300;

        if (year % 400 == 0){
            System.out.println("The year is a leap year");
            
        }
        else if (year % 100 == 0){
            System.out.println("The year is not a leap year");

        }
        else if (year % 4 == 0){
            System.out.println("The year is a leap year");

        }
        else {
            System.out.println("The year is not a leap year");
        }

    }
}