package PLACEMENT.LINKED_LIST;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void  insertAtposition(int pos,int data){
        Node newNode = new Node(data);
        Node temp=head;
        int count=1;
        while (count < pos-1 && temp !=null) {
          temp=temp.next;  
          count++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void deletefrompodition(int pos){
        Node temp=head;
        Node temp1=1;
        int count=1;
        while (count < pos-1 && temp !=null) {
          temp=temp.next;  
         
        }

    }

    public  void calculate(){
        Node temp=head;
        int count=0;
        while (temp !=null) {
            temp=temp.next;
            count++;
        }
        System.out.println(count);
    }

}

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);
        list.insertAtposition(3,35);
        list.deletefrompodition(5);

        
        
        System.out.println("Linked List:");
        list.traverse(); // Output: 10 -> 20 -> 30 -> null
        list.calculate();

    }
}
