package PLACEMENT.LINKED_LIST;

public class LinkedListMain {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Step 1: Define Node class inside main
        class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        // Step 2: Initialize head node (empty list)
        Node head = null;

        // Step 3: Insert at the beginning
        Node newNode1 = new Node(10);
        newNode1.next = head;
        head = newNode1;

        // Step 4: Insert at the end
        Node newNode2 = new Node(20);
        if (head == null) {
            head = newNode2;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode2;
        }

        Node newNode3 = new Node(30);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode3;

        // Step 5: Traverse and print the linked list
        temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
