//false code. not working
//implementation of min heap

import java.util.Scanner;

class W7CC5{

    static int[] tree;
    static int i, size;

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        W7CC5 obj = new W7CC5();
        
        System.out.println("Enter the size of the tree: ");
        int size = in.nextInt();

        tree = new int [size];

        System.out.println("Enter the elements into the tree: ");
        for (int i = 1; i < size; i++){
            tree[i] = in.nextInt();
            obj.MinSort();
        }

        obj.printHeap();

        in.close();
    }

    void MinSort(){

        int min = tree[i];

        if (tree[i] != 0){
            if (tree[i] < min){
                int temp = tree[i];
                tree[i] = tree[i+1];
                tree[i+1] = temp;
            }
        }
    }

    void printHeap(){

        System.out.println("The tree is: ");
        for (int i = 0; i < size; i++){
            System.out.print(tree[i] +" ");
        }
        System.out.println();
    }
}