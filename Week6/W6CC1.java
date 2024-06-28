//implementation of stack

class W6CC1{

    int sizeOfStack = 1000;
    int currentPointer = -1;
    int a[] = new int [sizeOfStack];

    void push(int x){
        if (currentPointer >= (sizeOfStack -1)){ //currentpointer exceeds the last element location of the array.
            System.out.println("Stack OVerflow");
        }
        else{
            a[++currentPointer] = x;
            System.out.println(x +" pushed into the stack");
        }
    }

    void pop(){
        if(currentPointer <= 0){ // currentpointer does not exceed 0
            System.out.println("Stack underflow");
        }
        else{
            int x = a[currentPointer--];
            System.out.println(x +" popped out of stack");
        }
    }

    void printStack(){
        for (int i = currentPointer; i > -1; i--){
            System.out.print(a[i] +" ");
        }
    }

    public static void main(String[] args) {

        W6CC1 obj = new W6CC1();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        System.out.println();

        obj.pop();
        obj.pop();
        System.out.println();
        
        System.out.print("Elements in the stack: ");
        obj.printStack();        
    }
}