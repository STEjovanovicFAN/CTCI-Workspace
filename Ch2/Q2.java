package Ch2;
import java.util.*;

public class Q2 {
    
    public static void main(String[] args) {
        Node head = new Node(3);
        /*head.appendToTail(3);
        head.appendToTail(2);
        head.appendToTail(2);
        head.appendToTail(1);
        head.appendToTail(1);
        */
        Node.printLinkedList(head);
        Node.printLinkedList(kToLast(head,1));

    }

    public static Node kToLast(Node head, int k){
        Node currNode = head;

        if(currNode == null || k == 0){
            return currNode;
        }

        int count = 0;
        while(currNode != null && count <= k){
            currNode = currNode.next;
            count++;
        }

        return currNode;
    }
}