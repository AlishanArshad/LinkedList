package LinkedList;

public class LLOperations {
    private int size;
    LLOperations(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;



        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add First
    Node head;
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add Last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Print
    public void  printList(){
        Node currNode = head;
        while (currNode != null){
            System.out.println(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    //delete
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
        }
        Node secondLast = head;
        assert head != null;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        size--;

    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LLOperations list = new LLOperations();
        list.addFirst("is");
        list.addFirst("This");
        list.addFirst("on");
        list.addLast("List");
        list.printList();
        System.out.println(list.getSize());
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
    }
}
