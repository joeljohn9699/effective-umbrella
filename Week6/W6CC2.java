//program to implement push, pop and to get the min element in the stack.

import java.util.Scanner;

class W6CC2{

    Scanner in = new Scanner(System.in);

    int top = -1; 
    static int size, stack[], element;
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        W6CC2 obj = new W6CC2();
        
        System.out.println("Enter the size of the stack: ");
        size = in.nextInt();
        stack = new int [size];

        System.out.println("Enter the number of operations to perform: ");
        int operations = in.nextInt();

        System.out.println("Enter 'push' to push an element. \nEnter 'pop' to pop an element.");
        System.out.println("Enter 'min' to get minimum number in the stack.");    

        for (int i = 1; i <= operations; i++){
            
            System.out.println("Enter operation " +i);
            String choice = in.next();
        
            switch(choice){
                case "push": System.out.println("Enter the element to push: "); 
                    element = in.nextInt(); 
                    obj.push(element);
                    break;
                case "pop": obj.pop();
                    break;
                case "min": obj.min();
                    break;

                default: System.out.println("Invalid Input.");
                    break;
            }
        }
    in.close();

    }
    
    private void print() {
        System.out.println("The elements in the stack are: ");
        for (int i = 0; i <= top; i++){
            System.out.print(stack[i] +", ");
        }
        System.out.println();
    }

    private void min() {
        int min = stack[0];
        for (int i = 0; i <= top; i++){
            if (stack[i] < min){
                min = stack[i];
            }
        }
        System.out.println("The minimum element in the stack is: " +min);
        print();
    }

    private void push(int x){
        if (top >= (size-1)){
            System.out.println("Stack Overflow");
        }
        else{
            top++;
            stack[top] = x;
            System.out.println(x +" pushed into the stack");
        }
        print();
    }

    private void pop(){
        if (top < 0){
            System.out.println("Stack Underflow");
        }
        else{
            element = stack[top];
            top--;
            System.out.println(element +" popped from the stack.");
        }
        print();
    }
}
