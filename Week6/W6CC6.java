//circularlinkedlist. nothing

import java.util.Scanner;

class Node {
    int number;
    Node nextNode;

    Node(int number) {
        this.number = number;
        nextNode = null;
    }
}

class CircularLinkedList {
    Node listHead;
    Node listTail;

    void insert(int number) {

        Node temp = new Node(number);

        if (listHead == null) {
            listHead = temp;
        }

        if (listTail == null) {
            listTail = temp;
        } else {
            listTail.nextNode = temp;
            listTail = temp;
        }
        listTail.nextNode = listHead;
    }

    void display() {
        if (listHead == null) {
            return;
        }
        Node temp = listHead;

        System.out.print(temp.number + " ");

        temp = temp.nextNode;

        while (temp != listHead) {
            System.out.print(temp.number + " ");
            temp = temp.nextNode;
        }
        System.out.println();
    }
}

class CircularLinkedListMain {
    public static void main(String[] args) {

        CircularLinkedList obj = new CircularLinkedList();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of nodes: ");
        int noOfNodes = in.nextInt();

        System.out.println("Insert data of nodes: ");
        for (int i = 0; i < noOfNodes; i++) {
            obj.insert(in.nextInt());
        }

        System.out.println("Circular linked list --");
        obj.display();

        in.close();
    }
}