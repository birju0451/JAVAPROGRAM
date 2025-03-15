package PLACEMENT.LINKED_LIST;

public class test {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        //step 1: Define Node class inside main
        class Node {
            int data;
            Node next;

            public Node(int data){
                this.data=data;
                this.next=null;
            }
        }

        //step 2: Initialize head node(empty list)
        Node head = null;

        //step 3: Insert at the beginnig
        Node newNode1 =new Node(10);
        newNode1.next=head;
        head=newNode1;

        //step 4: Insert at the end
        Node newNode2=new Node(20);
        if (head == null){
            head=newNode2;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp=temp.next;
            }
            temp.next=newNode2;
        }

        Node newNode3 = new Node(30);
        Node temp=head;
        while(temp.next !=null){
            temp=temp.next;
        }
        temp.next=newNode3;

        //step 5: Traverse and  print the link the list
        temp=head;
        System.out.println("Linked List element :");
        while (temp.next != null) {
            System.out.println
            (temp.data+" ->");
            temp=temp.next;
        }
    }
}
