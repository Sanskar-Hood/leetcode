// import java.util.Scanner;
import java.util.Stack;

public class diameter_ap2 {

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
    
    public static class treeinfo{
        int ht;
        int dia;

        treeinfo(int ht , int dia){
            this.ht=ht;
            this.dia=dia;

        }
    }
    public static treeinfo diameter(Node node){
         if (node== null) {
             return new treeinfo(0, 0);
           }
        treeinfo left = diameter(node.left);
        treeinfo right = diameter(node.right);

        int myheight = Math.max(left.ht,right.ht)+1;

        int dia1=left.dia;
        int dia2 = right.dia;
        int dia3 = left.ht+right.ht+1;
        
        int mydia = Math.max(Math.max(dia2, dia3),dia1);
        
        treeinfo myinfo = new treeinfo(myheight, mydia) ;
        return myinfo; 
    }

   
 
    public static void main(String[] args) { //main

        Integer[] arr = {1, 2, 4, null, null, 5, 6, null, null, null, 3, 7, null, 9, null, null, 8, null, null};
        Node root = constructor(arr);
        System.out.println(diameter(root).dia);
    
       
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
