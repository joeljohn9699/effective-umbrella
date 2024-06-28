// implementation of Insertion Sort.

//import java.util.Scanner;

class W5CC1{

    //public static int size;

    static void insertionSort(int array[]){
        for (int i = 0; i < array.length; i++){ // size changed to array.length.
            int key = array[i];
            int j = i - 1;
            while ( j >= 0 && array [j] > key){
                array [j+1] = array[j];
                j--;
            }
            array[j+1] = key;
            
            for (int k = 0; k < array.length; k++){
                System.out.print(array[k] + " ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);

        // System.out.println("Enter the size of the array: ");
        // size = in.nextInt();
        //int array[] = new int[size];
        int array[] = {01, 20, 3, 69, 85, 47};

        // System.out.println("Enter the elements: ");
        // for (int i = 0; i < size; i++){
        //     array[i] = in.nextInt();
        // }

        System.out.println("The elements in the array before sorting: ");
        for (int i = 0; i < array.length; i++){ // size changed to array.length.
            System.out.print(array[i] + " ");
        }
        System.out.println();

        insertionSort(array);

        System.out.println("The elements in the array after sorting: ");
        for ( int i = 0; i < array.length; i++){ // size changed to array.length.
            System.out.print(array[i] +" ");
        }
        System.out.println();
        //in.close();
    }
}