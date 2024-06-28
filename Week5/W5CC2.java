// implementation of Merge Sort.

import java.util.Scanner;

class W5CC2{

    Scanner in = new Scanner (System.in);
    public int array[];
    public int size;

    public void implementationOfMergeSort(){

        insertValues();

        sortArray(array, 0, array.length - 1);
    }

    public void insertValues(){

        System.out.println("Enter the size of the array. ");
        size = in.nextInt();
        array = new int[size];

        System.out.println("Enter the elements into the array: ");
        for (int i = 0; i < size; i++){
            array[i] = in.nextInt();
        }

        System.out.println("The original array: ");
        printValues();
    }

    public void sortArray(int arr[], int left, int right){ // Splitting of arrays.

        if (left < right){
            int mid  = ( left + right) / 2;

            sortArray(arr, left, mid); //Recursion.
            sortArray(arr, mid + 1, right);

            conquerArray(arr, left, mid, right);
        }
    }

    public void conquerArray( int arr[], int left, int mid, int right){

        int len1 = mid - left + 1; // Cresting left and right array.
        int len2 = right - mid;

        int leftArray[] = new int[len1];
        int rightArray[] = new int[len2];

        for (int i = 0; i < len1; i++) // Writing values to left and right arrays.
            leftArray[i] = array [left + i];
        for (int j = 0; j < len2; j ++)
            rightArray[j] = array [mid + 1 + j];

        int i, j, k;
        i = 0;
        j = 0;
        k = left;

        while ( i < len1 && j < len2){ // sorting left and right arrays.
            if (leftArray[i] <= rightArray[j]){
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while ( i < len1){ // code to print if left arrat is sorted and there are 1 or more elements pending in the right array.
            array[k] = leftArray[i];
            i++;
            k++;
        }
        
        while (j < len2){
            array[k] = rightArray[j];
            j++;
            k++;
        }

        //printValues(); // printing of sorted array after each iteraiton. not working. 
    }

    public void printValues(){

        for (int i = 0; i < size; i++){
            System.out.print(array [i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        W5CC2 obj = new W5CC2();

        obj.implementationOfMergeSort();

        System.out.println("The sorted array: ");
        obj.printValues();

    }
}