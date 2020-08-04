package Ch4;

public class Q2 {
    public static Node arrayToBST(int [] arr, int start, int end){
        if(end < start){
            return null;
        }

        int middle = (start + end)/2;
        Node n = new Node (arr[middle]);

        n.left = arrayToBST(arr, start, middle - 1);
        n.right = arrayToBST(arr, middle + 1, end);

        return n;
    }

    public static void printBST(Node n, int depth){
        if(n == null){
            return;
        }

        for(int i = 0; i < depth; i++){
            System.out.print("\t");
        }
        System.out.println(n.data);
        printBST(n.left, depth + 1);
        printBST(n.right, depth + 1);

    }

    public static void main(String [] args){
        int [] sortedArray = new int [] {
            1,2,3,4,5,6,7
        };

        Node n = arrayToBST(sortedArray, 0, sortedArray.length-1);
        printBST(n, 0);
        
    }
    
}