// tree constructor
import java.util.*;
public class tree_constructor {

    public static class Node{
        int data;
        Node left;
        Node right;

        //
        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair{
        Node node;
        int state;

        Pair(Node node, int state){
            this.node = node;
            this.state = state;
        }
    }
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 4, null, null, 5, 6, null, null, null, 3, 7, null, 9, null, null, 8, null, null};

        Node root = construct(arr);
        System.out.println(root.data);
        

    }    

    public static Node construct(Integer[] arr){
        Node root = new Node(arr[0], null, null);

        Stack<Pair> stack = new Stack<>();

        Pair p = new Pair(root, 0);
        stack.push(p);

        int idx = 1;

        while(stack.size() > 0){
            Pair obj = stack.peek();

            if(obj.state == 0){         // lc
                if(arr[idx] == null){
                    idx++;
                    obj.state++;
                }
                else{   
                    Node temp = new Node(arr[idx], null, null);
                    
                    obj.node.left = temp;

                    idx++;

                    obj.state++;

                    Pair t = new Pair(temp, 0);
                    stack.push(t);
                }
            }
            else if(obj.state == 1){    // rc
                if(arr[idx] == null){
                    idx++;
                    obj.state++;
                }
                else{   
                    Node temp = new Node(arr[idx], null, null);
                    
                    obj.node.right = temp;

                    idx++;

                    obj.state++;

                    Pair t = new Pair(temp, 0);
                    stack.push(t);
                }

            }
            else{           //2
                stack.pop();
            }
        }

        return root;        
    }


}
