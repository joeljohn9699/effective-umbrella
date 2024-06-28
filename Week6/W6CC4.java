// implementation of queue using arrays.

import java.util.Scanner;

class W6CC4{

    Scanner in = new Scanner(System.in);

    static int front, rear = -1;
    static int[] queue = new int [5];
    
    public static void main(String[] args) {

        // Scanner in = new Scanner(System.in);
        
        // System.out.println("Enter the size of Queue:");
        // int size  = in.nextInt();

        // queue = new int [size];

        // System.out.println("Choose 1 for Enqueue, 2 for Dequeue, 3 for exit:");

        // do{
        //     int choice  = in.nextInt();

        //     switch (choice) {
        //         case 1: enqueue(queue);     
        //             break;
        //         case 2: dequeue(queue);
        //             break;
        //         case 3: System.exit(0); 
        //         default: System.out.println("Invalid input");
        //             break;
        //     }
        // } while (true); 

        W6CC4 obj = new W6CC4();

        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.dequeue();
        obj.dequeue();
    }

    private void dequeue(/*int[] queue*/) { 
        if (isEmpty()){
            System.out.println("Queue Underflow");
        }
        else{
            System.out.println(queue[front] +" is removed from queue");
        }
        if (front == rear){
            front = -1; 
            rear = -1;
        }
        else {
            front++;
        }
        printQueue(queue);
    }

    private static boolean isEmpty() {
        if (front == -1)
        return true;
        else
        return false;
    }

    private void enqueue(int x) { //int[] queue
        if (isFull()){
            System.out.println("Queue Overflow");
        }
        else{
            // Scanner in = new Scanner(System.in);
            // System.out.println("Enter element to insert:");
            // int element = in.nextInt();
            rear++;
            queue[rear] = x;
            System.out.println(x +" pushed into queue");
        }
        if (front == -1){
            front = 0;
        }
        printQueue(queue);
    }

    private static void printQueue(int[] queue2) {
        System.out.println("The queue contains: ");
        for(int i = front; i <= rear; i++){
            if (i == -1 && rear == -1){
                System.out.print("Empty Queue");
                break;
            }
            System.out.print(queue[i] +" ");
        }
        System.out.println();
    }

    private static boolean isFull() {
        if (rear == (queue.length-1))
        return true;
        else
        return false;
    }
}