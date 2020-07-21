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
        m.appendToTail(interNode);

        Node.printLinkedList(n);
        Node.printLinkedList(m);
        Node.printLinkedList(intersect(n, m));

    }

    public static Node intersect(Node n, Node m){
        Node nCurr = n;
        Node mCurr = m;

        int nSize = getSize(n);
        int mSize = getSize(m);

        while (nSize != mSize){
            if(nSize > mSize){
                nCurr = nCurr.next;
                nSize--;
            }
            else{
                mCurr = mCurr.next;
                mSize--;
            }
        }

        while(nSize > 0 && mSize > 0){
            if(nCurr.data == mCurr.data){
                return nCurr;
            }
            nCurr = nCurr.next;
            mCurr = mCurr.next;
            nSize--;
            mSize--;
        }
    
        return null;
    }

    public static int getSize(Node n){
        Node nCurr = n;
        int size = 0;
        while(nCurr != null){
            nCurr = nCurr.next;
            size = size + 1;
        }
        return size;
    }

}