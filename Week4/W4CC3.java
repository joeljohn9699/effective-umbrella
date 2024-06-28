// implementation of bubble sort.

import java.util.Scanner;

class W4CC3{

    static int size;

    static void bubbleSort(int array[]){
        if (size > 1){
            for (int i = 0 ; i < size; i++){
                for  (int j = 0 ; j < size-1; j++){
                    if(array[j] > array[j+1]){
                        int temp = array[j+1];
                        array[j+1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the size of array: ");
        size = in.nextInt();
        int array[] = new int[size];

        System.out.println("Enter the elements into the array: ");
        for (int i = 0; i < size; i++){
            array[i] = in.nextInt();
        }

        System.out.println("The elements in the array before sorting: ");
        for (int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        bubbleSort(array);

        System.out.println("The elements in the array after sorting: ");
        for (int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        in.close();
    }
}