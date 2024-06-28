//implementation of radix sort.

import java.util.Arrays;
import java.util.Scanner;

class W5CC4{

    // public void printValues(int array[], int size){
    //     for (int i = 0; i < size; i++){
    //         System.out.print(array[i] +" ");
    //     }
    //     System.out.println();
    // }

    void radixSort(int[] array, int size){
        int m = maxElement(array, size);

        for (int exp = 1; m / exp > 0; exp *= 10)// counting sort for numbers based on their exponential sizes.
        countSort(array, size, exp);
    }

    int maxElement(int [] array, int size){ //function to find max element in the array.
        int maxElement = array[0];
        for(int i = 0; i < size; i++){
            if (array[i] > maxElement){
                maxElement = array[i];
            }
        } 
        System.out.println("The max value in the array is: " +maxElement);
        return maxElement;
    }

    void countSort(int[] array, int size, int exp){
        int [] output = new int [size]; // new output array to store sorted values.
        int i;
        int [] count = new int [10];
        Arrays.fill(count,0); // filling the new count array with 0's. 

        for (i = 0; i < size; i++){
            count [(array[i] / exp) % 10]++;
        }

        for (i = 1; i < 10; i++){
            count[i] += count[i-1];
        }

        for (i = size-1; i >= 0; i--){
            output[count[(array[i] / exp) % 10] -1 ] = array[i];
            count[(array[i] / exp) % 10]--;
        }

        for (i = 0; i < size; i++){
            array[i] = output[i];
        }
        
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        W5CC4 obj = new W5CC4();
        
        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();
        int array[] = new int [size];

        System.out.println("Enter the positive integer elements into the array: ");
        for ( int i = 0; i < size; i++){
            array[i] = in.nextInt();
        }

        System.out.println("The values before sorting: ");
        System.out.println(Arrays.toString(array)); // printing array.
        //obj.printValues(array,size);

        obj.radixSort(array, size);

        System.out.println("The values after sorting: ");
        System.out.println(Arrays.toString(array));
        //obj.printValues(array, size);

        in.close();
    }
}