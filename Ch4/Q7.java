package Ch4;
import java.util.*;

public class Q7 {
    public static void dependencies(List<String> proj, List<String []> dep){
        List<DepNode> nodes = new ArrayList<DepNode>();

        for(int i  = 0; i < proj.size(); i++){
            nodes.add(new DepNode(proj.get(i)));
        }

        for(int i = 0; i < dep.size(); i++){
            DepNode firstProj = nodes.get(proj.indexOf(dep.get(i)[0]));
            DepNode secProj = nodes.get(proj.indexOf(dep.get(i)[1]));

            firstProj.dependsTo.add(secProj);
            secProj.dependsOn.add(firstProj);

        }

        List<DepNode> noDeps = new ArrayList<DepNode>();
        for(int i = 0; i < nodes.size(); i++){
            if(nodes.get(i).dependsOn.isEmpty()){
                noDeps.add(nodes.get(i));
            }
        }
        printOrder(noDeps);

    }

    public static void printOrder(List<DepNode> noDeps){
        HashSet repeat = new HashSet<String>();
        Queue<DepNode> fifo = new LinkedList<DepNode>();
        for(int i = 0; i < noDeps.size(); i++){
            fifo.add(noDeps.get(i));
        }

        while(!fifo.isEmpty()){
            DepNode node = fifo.remove();
            if(!repeat.contains(node.val)){
                System.out.println(node.val);
                repeat.add(node.val);
            }
        
            for(int i = 0; i < node.dependsTo.size(); i++){
                fifo.add(node.dependsTo.get(i));
            }
        }

    }

   public static void main(String [] args){
        List<String> proj = new ArrayList<String>();
        proj.add("a");
        proj.add("b");
        proj.add("c");
        proj.add("d");
        proj.add("e");
        proj.add("f");
   
        List<String []> dep = new ArrayList<String[]>();
        String [] pair1 = {"a", "d"};
        dep.add(pair1);
        String [] pair2 = {"f", "b"};
        dep.add(pair2);
        String [] pair3 = {"b", "d"};
        dep.add(pair3);
        String [] pair4 = {"f", "a"};
        dep.add(pair4);
        String [] pair5 = {"d", "c"};
        dep.add(pair5);

        dependencies(proj, dep);
    }  
}
