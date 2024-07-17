// import java.util.Scanner;
import java.util.Stack;

public class diameter_ap1 {

    public static class Node {  //creating a node class 
        int data;
        Node left;
        Node right;

        Node(int data,Node left, Node right){     //calling node class and assigning values recieve to it
            this.data=data;
            this.left=left;
            this.right=right;

        }
    }

    public static class Pair {          //defining class pair for stack handling pair=(node,state)
        Node node ;
        int state;

        Pair(Node node , int state){
            this.node=node;
            this.state=state;
        }
    
        
    }
    
    public static int height(Node node){
        if(node==null) return 0;

        int lh=height(node.left);
        int rh=height(node.right);
        
        return 1+Math.max(lh, rh);
    }

    public static int diameter(Node node){
        if(node==null) return 0;
        int ld=diameter(node.left);
        int rd=diameter(node.right);
        int h = height(node.left)+height(node.right)+1;

        return(Math.max(ld, Math.max(rd, h)));
    }
    public static void main(String[] args) { //main

        Integer[] arr = {1, 2, 4, null, null, 5, 6, null, null, null, 3, 7, null, 9, null, null, 8, null, null};
        Node root = constructor(arr);
        System.out.println(diameter(root));
        

       
    }

    public static Node constructor(Integer[]arr ){
        Node root = new Node(arr[0],null, null);  //intially assigning the first root value 
        Stack<Pair> stack = new Stack<>();      //stack creation    
        Pair p =new Pair(root,0);           //creating root node as pair 
        stack.push(p);

        int idx=1;

        while (stack.size()>0) {

            Pair obj = stack.peek();
            if(obj.state==0){               //state 0
                if(arr[idx]==null){
                    idx++;

                    obj.state++;
                }

                else{
                    Node  temp = new Node(arr[idx], null, null);

                    obj.node.left=temp;

                    idx++;

                    obj.state++;

                    Pair t =new Pair(temp, 0);
                    stack.push(t);


                }

            }

            else if(obj.state==1){
                if(arr[idx]==null){
                    idx++;

                    obj.state++;
                }

                else{
                    Node  temp = new Node(arr[idx], null, null);

                    obj.node.right=temp;

                    idx++;

                    obj.state++;

                    Pair t =new Pair(temp, 0);
                    stack.push(t);


                }


            }

            else{
                stack.pop();

            }
            
            
            
        }

        return root;



    }
    
}
