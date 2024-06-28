// implementation of binary search.

import java.util.Scanner;

class W4CC2{

    static void binarySearch(int element, int first, int last, int array[]){

        int mid  = (first + last) / 2;

        while (first <= last){
            if (element < array [mid]){
               last = mid - 1;
            } else if (element > array [mid]){
                first = mid + 1;
            } else { System.out.println("Element found at index: " +mid);
            break;
            }
            mid = (first + last) / 2;
            }

        if (first > last){
            System.out.println("Element not found.");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size of the array: ");
        int size = in.nextInt();
        int array [] = new int [size];
        int last = array.length - 1;
        //System.out.println("last element" + last);

        System.out.println("Enter the elements into the array: ");
        for (int i = 0; i < size; i++){
            array [i] = in.nextInt();
        }

        System.out.println("The elements in the array are: ");
        for (int i = 0; i < size; i++){
            System.out.println(array[i]);
        }

        System.out.println("Enter the element to search: ");
        int searchElement = in.nextInt();

        binarySearch(searchElement, 0, last, array);

        in.close();
    }
    
}