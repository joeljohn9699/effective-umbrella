//logical error in deletion (Not Done)
//implementation of operation on binary tree usinng array

import java.util.Scanner;

class W7CC2{

    static Scanner in = new Scanner(System.in);

    int[] tree; 
    int size;

    public static void main(String[] args) {

        W7CC2 obj = new W7CC2();
        
        System.out.println("Enter the size of the tree: ");
        obj.size = in.nextInt();

        obj.tree = new int [obj.size+1];

        System.out.println("Enter the elements into the tree: ");
        for ( int i = 1; i < obj.tree.length; i++){
            obj.tree[i] = in.nextInt();
        }

        do {
            System.out.println("Enter 1 for Insert, 2 for Delete, 3 for print tree with parent and children, 0 for exit.");
            int choice = in.nextInt();

            switch (choice) {
                case 1: obj.insertElement(); break;
                case 2: obj.deleteElement(); break;
                case 3: obj.printTree(); break;
                case 0: System.out.println("Exit successful.");
                System.exit(0);
            
                default: System.out.println("Invalid input.");
                    break;
            }
            
        } while (true);
    }

    void insertElement(){

        System.out.println("Enter how many elements you want to insert: ");
        int count = in.nextInt();

        int[] newTree = new int [tree.length+count];
        for (int i = 1; i < tree.length; i++){
            newTree [i] = tree [i];
        }

        for( int i = 1 ; i <= count; i++){
            System.out.println("Enter the element to insert: ");
            int element = in.nextInt();

            for ( int j = 1; j < newTree.length; j++){
                if (newTree [j] == 0){
                    newTree [j] = element;
                    break;
                }
            }
        }

        tree = new int [newTree.length];

        for( int i = 1; i < newTree.length; i++){
            tree [i] = newTree [i];
        }       
    }

    void deleteElement(){

        System.out.println("Enter the element to delete: ");
        int element = in.nextInt();

        for ( int i = 1; i < tree.length; i++){

            int last = tree[tree.length-1];
            
            if (element == tree[i]){
                tree[i] = last;
                tree[tree.length-1] = 0; 
            }

            last--;
        }
    }

    void printTree(){
        System.out.println("The tree contains: ");
        for (int i = 0; i < tree.length; i++){
            System.out.print(tree[i] +" ");
        }
        System.out.println();
    }
}