//Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
package LinkedList;
import java.util.*;
public class PracticeQuestions {
    /*public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);
        System.out.println(list);
//        System.out.println(list.size());
        int number = 7;
        for (int i = 0; i<list.size(); i++){
            if(list.get(i) == number){
                System.out.println("the item ( " + list.get(i) +" ) Found at index : " + i);
                break;
            }

        }
    }
}*/

//Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Enter Number in the range of 1 - 50  press -1 to exit : ");
        Scanner sc = new Scanner(System.in);
        while (true){
            int input = sc.nextInt();
            if (input == -1){
                break;
            }
            if (sc.hasNextInt() && input < 50){
                list.add(input);
                System.out.println("The Number is added to List type another or -1 to exit : ");
            }
            list.removeIf(num -> num > 25);
        }
        System.out.println(list);
    }
}