package Ch2;
import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        Node interNode = new Node(3);
        interNode.appendToTail(2);

        Node n = new Node(7);
        n.appendToTail(1);
        n.appendToTail(7);
        n.appendToTail(interNode);

        Node m = new Node(8);
        m.appendToTail(1);
        m.appendToTail(2);
        m.appendToTail(interNode);

        Node.printLinkedList(n);
        Node.printLinkedList(m);
        Node.printLinkedList(intersect(n, m));

    }

    public static Node intersect(Node n, Node m){
        Node nCurr = n;
        Node mCurr = m;

        while (nCurr != null){
            mCurr = m;
            while(mCurr != null){
                if(nCurr.hashCode() == mCurr.hashCode()){
                    return nCurr;
                }
                mCurr = mCurr.next;
            }
            nCurr = nCurr.next;
        }

        return null;
    }

}