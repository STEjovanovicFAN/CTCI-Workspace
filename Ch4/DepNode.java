package Ch4;
import java.util.*;

public class DepNode {

    List<DepNode> dependsOn;
    List<DepNode> dependsTo;
    String val;
    public DepNode (String val){
        dependsOn = new ArrayList<DepNode>();
        dependsTo = new ArrayList<DepNode>();
        this.val = val;
    }
}
