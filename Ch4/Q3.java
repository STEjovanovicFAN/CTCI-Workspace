package Ch4;

import java.util.*;

public class Q3 {

    public static ArrayList<LinkedList<Integer>> createDepthLL(Node n){
        ArrayList <LinkedList<Integer>> arrListDepth = new ArrayList <LinkedList<Integer>>();

        dfs(n, arrListDepth, 0);

        return arrListDepth;
    } 

    public static void dfs(Node n, ArrayList <LinkedList<Integer>> arrListDepth, int depth){
        if(n == null){
            return;
        }

        if(arrListDepth.size() <= depth){
            arrListDepth.add(new LinkedList<Integer>());
        }

        arrListDepth.get(depth).addLast(n.data);
        
        dfs(n.left, arrListDepth, depth + 1);
        dfs(n.right, arrListDepth, depth + 1);
    }

    public static void printArrayList(ArrayList<LinkedList<Integer>> arrList){
        for(int i = 0; i < arrList.size(); i++){
            LinkedList currLL = arrList.get(i);
            System.out.println("Depth: " + i);

            for(int j = 0; j < currLL.size(); j++){
                System.out.println(currLL.get(j));
            }
        }

    }

    public static void main(String [] args){
        Node root = new Node(1);
        Node left = new Node (4);
        root.left = left;
        root.right = new Node (88);
        left.left = new Node(7);

        printArrayList(createDepthLL(root));
        
    }
}