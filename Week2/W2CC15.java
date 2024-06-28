//implementation of encapsulation also including scanner. 

import java.util.Scanner;

class W2CC15{
    private int age;
    private boolean decision;

    public int GetAge(){
        return age;
    }

    public void SetAge(int a){
        this.age = a;
    }

    public boolean GetDecision(){
        return decision;
    }

    public void SetDecision(boolean b){
        this.decision = b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        W2CC15 obj = new W2CC15();
        System.out.println("Enter the age:");
        obj.SetAge(in.nextInt());
        
        if (obj.GetAge()<=60){
            obj.SetDecision(true);
        }
        else {
            obj.SetDecision(false);
        }

        System.out.println("The age of candidate is: " +obj.GetAge() +"\nDriving license can be issued to the candidate. " +obj.GetDecision());
        in.close();
    }
}