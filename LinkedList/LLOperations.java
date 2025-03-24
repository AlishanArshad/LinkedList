package LinkedList;

public class LLOperations {
    static class Node{
        String data;
        Node next;


        Node(String data){
            this.data = data;
            this.next = null;
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
    public static void main(String[] args) {
        LLOperations list = new LLOperations();
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("List");
        list.printList();

    }
}
