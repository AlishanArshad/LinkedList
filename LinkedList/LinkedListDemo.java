package LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        a.next = b;
        b.next = c;
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next);
        System.out.println(b.next.data);


    }
}
