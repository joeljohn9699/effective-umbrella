// Nested for loop (Design print)

class W3CC4{
    public static void main(String[] args) {
        int i = 1;

        for (i=1;i<=5;i++){
            for (int j = 0; j<i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
