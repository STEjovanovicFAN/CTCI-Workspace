package Ch2;
import java.util.*;

public class Q3 {

    public static void main(String[] args) {
        Node head = new Node(3);
        head.appendToTail(4);
        head.appendToTail(5);
        head.appendToTail(1);
        head.appendToTail(2);
        Node.printLinkedList(head);
        Node.printLinkedList(DMN(head,new Node(2)));

    }

    public static Node DMN(Node ll, Node n){
        Node currNode = ll;

        if(currNode.data == n.data){
            return currNode.next;
        }

        Node prev = currNode; 
        currNode = currNode.next;

        while(currNode != null){

            if(currNode.data == n.data){
                prev.next = currNode.next;
                break;
            }

            prev = currNode;
            currNode = currNode.next;

        }

        return ll;
    }
    
}