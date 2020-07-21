package Ch2;
import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        
        Node m = new Node(4);
        Node broken = new Node(6);
        broken.next = m;

        Node n = new Node(1);
        n.appendToTail(2);
        n.appendToTail(3);
        n.appendToTail(m);
        n.appendToTail(5);
        n.appendToTail(broken);

        //Node.printLinkedList(n);
        System.out.println(checkLoop(n).data);
    }

    public static Node checkLoop(Node n){
        Node slow = n;
        Node fast = n;

        while (slow != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow.data == fast.data){
                break;
            }
        }

        slow = n;
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}