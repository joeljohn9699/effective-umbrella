//implementation of binary tree using array

import java.util.Scanner;

class W7CC1{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the size of the tree: ");
        int size = in.nextInt();

        int[] tree = new int [size+1];

        System.out.println("Enter the elements into the tree: ");
        for (int i = 1; i < tree.length; i++){
            tree[i] = in.nextInt();
        }

        System.out.println("The tree contains: ");
        for( int j = 0; j < tree.length; j++){
            System.out.print(tree[j] +" ");
        }
        System.out.println();
        in.close();
    }
}