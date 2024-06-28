//continue and break in for loop

class W3CC6{
    public static void main(String[] args) {
        int a = 1;
        
        for ( ; ; a++){
            //Infinite loop
            if (a % 2 != 0) continue;
            else if (a > 20) break;
            else System.out.println(a);  
        } 
    }
}