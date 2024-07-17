import java.util.*;
public class clone {
    public static Node clonegraph (Node node ){
        if (node==null) return null; //null pointer exception
        Map<Node , Node> map = new HashMap<>() ;
        Queue<Node> que = new ArrayDeque<>();
         map.put(node, new Node(node.val,new ArrayList<>()));
         que.add(node);

         while(que.size()>0){
            Node n =que.remove();
            for(Node neighbour : n.neighbors){
                if(!map.containsKey(neighbour)){
                    map.put(neighbour , new Node(neighbour.val , new ArrayList<>()));
                    que.add(neighbour);

                }
                map.get(n).neighbors.add(map.get(neighbour));
            }
         }
         return map.get(node);
    }
    
}
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}