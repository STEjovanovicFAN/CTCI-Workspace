package Ch4;
import java.util.*;

public class Q8 {

    public static void BTSSequence(Node n){
        Queue queue = new LinkedList<Node>();
        queue.add(n);

        while(queue.size() != 0){
            Node temp = (Node) queue.poll();
            System.out.println(temp.data);

            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }

        }

    }

    public static void printArray(int [] arr){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
        }

        System.out.println(sb.toString());
    }

    public static void main(String [] args){
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);

        BTSSequence(root);
    }
}
