//implementation of quick sort.

import java.util.Scanner;

class W5CC3{

    public void printValues(int array[], int size){
        for (int i = 0; i < size; i++){
            System.out.print(array[i] +" ");
        }
        System.out.println();
    }

    void quickSort(int[] array, int left, int right) {

        if(left < right){
            printValues(array, array.length); // print values in array after every iteration.
            int pivotIndex = partition(array, left, right); //creating the point for pivot. 

            quickSort(array, left, pivotIndex-1); // starting point of recursion to create left branch to carry out sorting.
            quickSort(array, pivotIndex + 1, right); // starting point of recursion to create right branch to carry out sorting.
        }
    }

    int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1; // i becomes -1.

        for (int j = left; j <= right-1; j++){ // runs from left to right -1 (the pivot).
            if (array[j] < pivot){
                i++;
                swapValues(array, i , j); //if condition becomes true values are swapped.
            }
        }
        swapValues(array, i+1, right); //if condition becomes false the values are swapped by skipping the i to i+1.
        return (i+1);
    }

    void swapValues(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        W5CC3 obj = new W5CC3();
        
        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();
        int array[] = new int [size];

        System.out.println("Enter the elements into the array: ");
        for ( int i = 0; i < size; i++){
            array[i] = in.nextInt();
        }

        System.out.println("The values before sorting: ");
        obj.printValues(array,size);

        obj.quickSort(array, 0, size-1);

        System.out.println("The values after sorting: ");
        obj.printValues(array, size);

        in.close();
    }
}