package Ch2;
import java.util.*;

public class Q4 {

    public static void main(String[] args) {
        Node head = new Node(3);
        head.appendToTail(5);
        head.appendToTail(8);
        head.appendToTail(5);
        head.appendToTail(10);
        head.appendToTail(2);
        head.appendToTail(1);
        Node.printLinkedList(head);
        Node.printLinkedList(partition(head, 5));

    }
    

    public static Node partition(Node n, int part){

        Node beforeSP = null, afterSP = null, beforeEP = null, afterEP = null;

        Node currNode = n;

        while(currNode != null){
            if(currNode.data < part){
                if(beforeSP == null){
                    beforeSP =  currNode;
                    afterSP = beforeSP;
                }
                else{
                    afterSP.next = currNode;
                    afterSP = afterSP.next;
                }
            }
            else{
                if(beforeEP == null){
                    beforeEP = currNode;
                    afterEP = beforeEP;
                }
                else{
                    afterEP.next = currNode;
                    afterEP = afterEP.next;
                }

            }
            currNode = currNode.next;
        }
        afterSP.next = null;
        afterEP.next = null;

        if(beforeSP == null){
            return beforeEP;
        }

        afterSP.next = beforeEP;

        return beforeSP;
    }
}