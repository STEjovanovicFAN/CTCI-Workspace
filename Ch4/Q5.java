package Ch4;
import java.util.*;

public class Q5 {

    public static boolean checkBounds(Node n, int comp, String operation ){
        if(n == null){
            return true;
        }

        if(operation.equals("higher")){
            if(n.data < comp){
                return false;
            }
        }
        else{
            if(n.data > comp){
                return false;
            }
        }

        return checkBounds(n.left, comp, operation) && checkBounds(n.right, comp, operation);

    }
    
    public static boolean checkBST(Node n){
        if(n == null){
            return true;
        }

        if(checkBounds(n.left, n.data, "lower") && checkBounds(n.right, n.data, "higher") && checkBST(n.left) && checkBST(n.right)){
            return true;
        }

        return false;
    }

    public static void main (String [] args){
        Node root = new Node(3);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(2);

        System.out.println(checkBST(root));
    }
}