package datastructure;

public class SinglelyLinkedList {

    static class Node {
        int value;
        Node next;

        Node(int Value) {
            this.value = Value;
            this.next = null;
        }
    }

    public void display(Node node) {
        int count =0;
        if (node == null) {
            return;
        }
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
            count++;
        }

        System.out.println(node);
        System.out.println(count);
    }

    public Node InsertAtFront(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }

    private void InsertAtEnd(Node tail, int data){
        Node newNode = new Node(data);
        if(tail==null) {
            return ;
        }
        tail.next=newNode;
        return;
    }

    private void InsertInMid(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return;
        }
        newNode.next = head.next;
        head.next = newNode;
       // return head;
    }

    private void DeleteNode(Node Head,int deleteNode) {

        if(Head.next.equals(deleteNode)){

        }
    }

    public static void main(String[] args) {
        SinglelyLinkedList ll = new SinglelyLinkedList();
        Node first = new Node(1);
        Node second = new Node(5);
        Node third = new Node(7);
        first.next = second;
        second.next = third;
       // ll.display(first);
       /* ll.display(first);
        ll.InsertAtFront(first,27);
        ll.display(ll.InsertAtFront(first,27));
        ll.InsertAtEnd(third,76);
        ll.display(first);
        ll.display(ll.InsertAtFront(first,27));*/
        ll.InsertInMid(first,55);
       // ll.display(first);
        ll.InsertAtEnd(third,76);
        ll.display(first);


    }
}
