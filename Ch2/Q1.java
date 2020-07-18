package Ch2;
import java.util.*;

public class Q1 {
    
    public static void main(String[] args) {
        Node head = new Node(3);
        head.appendToTail(3);
        head.appendToTail(2);
        head.appendToTail(2);
        head.appendToTail(1);
        head.appendToTail(1);
        Node.printLinkedList(head);
        Node.printLinkedList(removeDups(head));

    }

    public static Node removeDups(Node head){
        Node currNode = head;
        Node prev = null;
        Node ahead = null;

        if(currNode == null || currNode.next == null){
            return head;
        }

        while(currNode != null){
            prev = currNode;
            ahead = currNode.next;
            while(ahead != null){
                if(ahead.data == currNode.data){
                    prev.next = ahead.next;
                    
                }
                else{
                    prev = ahead;
                }
                ahead = ahead.next;
            }
            currNode = currNode.next;
        }

        return head;
    }

}