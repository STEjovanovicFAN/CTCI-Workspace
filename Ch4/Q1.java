package Ch4;
import java.util.*;

public class Q1 {
    
    public static boolean recurse (int StartNode, int EndNode, ArrayList<ArrayList<Integer>> adj, Boolean [] traversedNodes){

        traversedNodes[StartNode] = true;
        for(int i = 0; i < adj.get(StartNode).size(); i++ ){
            if(adj.get(StartNode).get(i) == EndNode){
                return true;
            }

            if( traversedNodes[adj.get(StartNode).get(i)] == null){
                return recurse(adj.get(StartNode).get(i), EndNode, adj, traversedNodes);
            }

        }

        return false;
    }


    public static boolean dfs( ArrayList<ArrayList<Integer>> adj, int nodeSize, int StartNode, int EndNode){

        Boolean [] traversedNodes = new Boolean [nodeSize];

        Boolean path = recurse(StartNode, EndNode, adj, traversedNodes);

        return path;
    }

    public static void main (String [] args){
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }

        Graph.addEdge(adj, 0, 1);
        Graph.addEdge(adj, 0, 4);
        Graph.addEdge(adj, 1, 2);
        Graph.addEdge(adj, 1, 3);
        Graph.addEdge(adj, 1, 4);
        Graph.addEdge(adj, 2, 3);
        Graph.addEdge(adj, 3, 4);

        Graph.printGraph(adj);

        System.out.println("\nPrint out if there is a path between nodes: " + dfs(adj, V, 0, 3));

    }

}