package Collections.List.LinkedList;


public class MyLinkList {

    Node head;

    //Creating a class for LinkList Node
    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Creating a Method for printing LinkList
    public void printMyLinkedList() {

        Node n = head;

        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String[] args) {

        MyLinkList myLinkList = new MyLinkList();
        Node first = myLinkList.new Node(10);
        myLinkList.head = first;

        Node second = myLinkList.new Node(20); // Node creating
        first.next = second; // Mapping the node

        Node third = myLinkList.new Node(30);
        second.next = third;

        myLinkList.printMyLinkedList();
    }
}
