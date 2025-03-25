package LinkedList;
import java.util.LinkedList;
public class PredefinedFunction {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("List");
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i) + " -> ");
        }
        System.out.println(list.size());
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        System.out.println(list.get(1));

    }
}
