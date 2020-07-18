package Ch2;
import java.util.*;

public class Node {
    Node next = null;
    int data;

    //initalize Node
    public Node(int d){
        data = d;
    }

    public void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    } 

    public static void printLinkedList(Node n){
        Node head = n;
        System.out.print("LL: ");
        while(head != null){
            System.out.print(" " + head.data + " ->");
            head = head.next;
        }
        System.out.println(" null");
    }
}