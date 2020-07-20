package Ch2;
import java.util.*;

public class Q5 {

    public static void main(String[] args) {
        Node n = new Node(7);
        n.appendToTail(1);
        //n.appendToTail(6);

        Node m = new Node(5);
        //m.appendToTail(9);
        //m.appendToTail(2);

        //Node.printLinkedList(head);
        Node.printLinkedList(sumLists(n,m));

    }

    public static Node sumLists(Node n, Node m){
        Node sumHead = null;
        Node sumCurr = null;

        Node nCurr = n;
        Node mCurr = m;

        int counter = 0;

        while(nCurr != null || mCurr != null){
            if(nCurr == null || mCurr == null){
                if(nCurr == null){
                    if(sumHead != null){
                        sumCurr.next = new Node(mCurr.data + counter);
                        counter = 0;
                        sumCurr = sumCurr.next;
                    }
                    else{
                        sumHead = new Node(mCurr.data + counter);
                        counter = 0;
                        sumCurr = sumHead;
                    }
                }

                if(mCurr == null){
                    if(sumHead != null){
                        sumCurr.next = new Node(nCurr.data + counter);
                        counter = 0;
                        sumCurr = sumCurr.next;
                    }
                    else{
                        sumHead = new Node(nCurr.data + counter);
                        counter = 0;
                        sumCurr = sumHead;
                    }
                }
            }
            else{
                int intSum = nCurr.data + mCurr.data + counter;
                counter = 0;

                if(intSum > 9){
                    intSum = intSum - 10;
                    counter = 1;
                }

                if(sumHead != null){
                    sumCurr.next = new Node(intSum);
                    sumCurr = sumCurr.next;
                }
                else{
                    sumHead = new Node(intSum);
                    sumCurr = sumHead;
                }
            }

            if(nCurr != null)
                nCurr = nCurr.next;
            if(mCurr != null)
                mCurr = mCurr.next;
        }

        if( counter != 0){
            sumCurr.next = new Node(counter);
        }

        return sumHead;

    }
    
}