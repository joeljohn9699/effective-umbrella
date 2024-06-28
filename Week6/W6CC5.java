// implementation of singly linked list

class W6CC5{

    class Node{
        public int nodeData;
        public Node nextNode;
    }
    private Node head;

    public static void main(String[] args) {
        
        W6CC5 sll = new W6CC5();
        sll.insertAtFront(10);
        sll.insertAtFront(20);
        sll.displayLinkedList();
        sll.insertAtLast(30);
        sll.insertAtLast(40);
        sll.displayLinkedList();
        sll.insertAtPosition(2,50);
        sll.insertAtPosition(4,60);
        sll.displayLinkedList();
        sll.deleteAtFront();
        sll.deleteAtFront();
        sll.displayLinkedList();
        sll.deleteAtLast();
        sll.deleteAtLast();
        sll.displayLinkedList();
        sll.deleteAtPosition(0);
        sll.deleteAtPosition(1);
        sll.displayLinkedList();
    }

    private void insertAtFront(int data){

        Node newNode = new Node();
        newNode.nodeData = data;
        newNode.nextNode = head;
        head = newNode;
    }

    private void insertAtLast(int data){
        Node currentNode = head;

        while(currentNode.nextNode != null){
            currentNode = currentNode.nextNode;
        }

        Node newNode = new Node();
        newNode.nodeData = data;
        currentNode.nextNode = newNode;
    }

    private void insertAtPosition(int position, int data){
        Node currentNode = head;

        for(int i = 0; i < position-1; i++){
            currentNode = currentNode.nextNode;
        }

        Node tempNode = currentNode;
        currentNode = currentNode.nextNode;

        Node newNode = new Node();
        newNode.nodeData = data;

        tempNode.nextNode = newNode;
        newNode.nextNode = currentNode;
    }

    private void displayLinkedList(){
        Node currentNode = head;

        while (currentNode != null){
            System.out.print(currentNode.nodeData +" -> ");
            currentNode = currentNode.nextNode;
        }

        System.out.println("NULL");
    }

    private void deleteAtFront(){
        head = head.nextNode;
    }

    private void deleteAtLast(){
        Node currentNode = head;

        if(head.nextNode == null){
            head = null;
        }
        else{
            while (currentNode.nextNode.nextNode != null){
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = null;
        }
    }

    public void deleteAtPosition(int position){
        if (head == null)
        return;

        Node temp = head;

        if (position == 1){
            head = temp.nextNode;
            return;
        }
        for (int i = 0; temp != null && i < position-1; i++){
            temp = temp.nextNode;
        }

        if (temp == null || temp.nextNode == null){
            System.out.println("Position out of bounds.");
            return;
        }

        Node next = temp.nextNode.nextNode;

        temp.nextNode = next;
    }
}