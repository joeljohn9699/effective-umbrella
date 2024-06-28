//demo of linear search.

import java.util.Scanner;

class W4CC1{
    public int searchElement;
    public int array[];
    public int size;
    public boolean flag = false;

    Scanner in = new Scanner (System.in);

    public void linearSearch(){
        System.out.println("Enter the size of the array");
        size = in.nextInt();
        array = new int[size];

        System.out.println("Enter the elements:");
        insertValues();
        printValues();

        System.out.println("Enter the element to be searched:");
        searchElement = in.nextInt();
        searchValue(searchElement);
    }
    
    public void insertValues(){
        for (int i = 0; i < size; i++){
            array [i] = in.nextInt();
        }
    }

    public void printValues(){
        System.out.println("The elements of this array are: ");
        for (int i = 0; i < size; i++){
            System.out.println(array[i]);
        }
        System.out.println();
    }

    public void searchValue(int element){
        for (int i = 0; i < size; i++){
            if (array[i] == element){
                System.out.println("The element is found at index:" +i);
                flag = true;
            }
        }
        if (flag == false){
            System.out.println("The element is not found.");
        }
    }

    public static void main(String[] args) {
        W4CC1 obj = new W4CC1();
        obj.linearSearch();   
    }
}