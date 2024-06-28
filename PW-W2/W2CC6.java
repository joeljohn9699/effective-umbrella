// Switch Demo

class W2CC6{
    public static void main(String[] args) {
        int a = 1;
        switch (a){
            case 1 : System.out.println ("Neither Prime nor Composite"); break;
            case 2 : System.out.println ("Number is Prime"); break;
            case 3 : System.out.println ("Number is invalid"); break;
            case 4 : System.out.println ("Number is Composite"); break;
            default: System.out.println ("Not a valid case");
            
        }
    }
}