//copied code
//implementation of max heap.

import java.util.Scanner;

class W7CC6 {

    static public int[] tree = new int[2];
    static public int i;
    public int size, index, newvalue;
    
    static Scanner sc = new Scanner(System.in);
    
    public void insertValue() { // when array is empty
        
        System.out.println("Enter number of values to insert in the array binary tree");
        size = sc.nextInt();
        tree = new int[size + 1];
        
        for (i = 1; i <= size; i++) {
            System.out.println("Enter value " + i + ": ");
            newvalue = sc.nextInt();
            
            if (newvalue != 0) { // check if inserted value is not 0
                tree[i] = newvalue;
                maxSort();
                printTree();
            } 
            else {
                System.out.println("cannot use 0. Reserved for other purpose. Inser different value");
                i--;
            }
        }
        i--; // decrementing i after last iteration
    }
    
    public void maxSort() {
        
        boolean sta = false;
        
        while (sta == false) {
            sta = sort();
        }
    }
    
    public boolean sort() {
        boolean status = true;
        int parent_index, left_index, j = i;
        
        while (j > 1) {
            if (j % 2 != 0) { // j is at some right node
                parent_index = (j - 1) / 2;
                left_index = 2 * parent_index; // or j-1
                
                if (tree[parent_index] >= tree[left_index]) {
                    
                    if (tree[parent_index] < tree[j]) {
                        
                        swap(parent_index, j);
                        status = false;
                    }
                } 
                else if (tree[parent_index] < tree[left_index]) {
                    
                    if (tree[left_index] > tree[j]) {
                        
                        swap(left_index, parent_index);
                        status = false;
                    } 
                    else if (tree[left_index] < tree[j]) {
                        
                        swap(parent_index, left_index);
                        status = false;
                    }
                }
            }
            else { // when j is at some left node
                
                parent_index = j / 2;
                
                if (tree[parent_index] < tree[j]) {
                    
                    swap(parent_index, j);
                    status = false;
                }
            }
            j--;
        }
        return status;
    }
    
    public void swap(int index1, int index2) {
        
        int temp;
        temp = tree[index1];
        tree[index1] = tree[index2];
        tree[index2] = temp;
    }

    public void printTree() { // print array binary tree level by level
        
        System.out.println("Binary Tree in level by level order. Root is: " + tree[1]);
        
        for (int j = 1; j <= i; j++) {
            System.out.print(tree[j] + "{" + j + "}" + " ");
        }
        
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        
        W7CC6 maxheap = new W7CC6();
        maxheap.insertValue();
        
        System.out.println("Program completed successfully!!!");
    }
}