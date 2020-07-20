package Ch2;
import java.util.*;

public class Q6 {

    public static void main(String[] args) {
        Node n = new Node(7);
        n.appendToTail(1);
        n.appendToTail(7);

        Node.printLinkedList(n);
        System.out.println(checkPalindrone(n));

    }
    
    public static Boolean checkPalindrone(Node n){

        if(n == null){
            return true;
        }

        Node currNode = n;
        int size = 0;
        while( currNode != null){
            size++;
            currNode = currNode.next;
        }

        Node firstNode = n;
        Node lastNode = n;

        for(int i = 0; i < size/2; i++){
            int firstBound = i;
            int lastBound = size - i -1;

            for(int j = 0; j < firstBound; j++){
                firstNode = firstNode.next;
            }

            for(int k = 0; k < lastBound; k++){
                lastNode = lastNode.next;
            }

            if(firstNode.data != lastNode.data){
                return false;
            }

            firstNode = n;
            lastNode = n;
        }

        return true;
    }

}