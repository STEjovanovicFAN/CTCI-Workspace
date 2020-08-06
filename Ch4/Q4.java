package Ch4;
import java.util.*;

class Q4{


    public static int getHeight(Node n, int depth){
        if(n == null){
            return depth;
        }

        return Math.max(getHeight(n.left, depth + 1), getHeight(n.right, depth + 1));

    }

    public static boolean isBalanced(Node n){
        if(n == null){
            return true;
        }

        if(Math.abs(getHeight(n.left, 0) - getHeight(n.right, 0)) <= 1 && isBalanced(n.left) && isBalanced(n.right)){
            return true;
        }

        return false;
        
    }

    public static void main(String [] args){
        Node root = new Node(5);
        Node left = new Node(4);
        left.left = new Node(3);
        root.left = left;
        //root.right = new Node (8);

        System.out.println(isBalanced(root));
    }
}