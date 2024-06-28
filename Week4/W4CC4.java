//implementation of Selection Sort.

import java.util.Scanner;

class W4CC4{

    public static int size;

    static void selectionSort(int array[]){
        for (int i = 0; i < size - 1; i++){
            int index = i;
            for ( int j = i + 1; j < size; j++){
                if (array [j] < array [index]){
                    index = j;
                }
            }
            int smallNumber = array[index];
            array [index] = array [i];
            array [i] = smallNumber;   
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        size = in.nextInt();
        int array[] = new int[size];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++){
            array[i] = in.nextInt();
        }

        System.out.println("The elements in the array before sorting: ");
        for (int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        selectionSort(array);

        System.out.println("The elements in the array after sorting: ");
        for ( int i = 0; i < size; i++){
            System.out.print(array[i] +" ");
        }
        System.out.println();
        in.close();
    }
}