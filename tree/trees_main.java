import java.util.*;
 class trees_main {

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

        // find
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        sc.close();
    

        boolean ans = find(root, val);
        System.out.println(ans);

        ArrayList<Integer> al = new ArrayList<>();
        nodeToRootPath(root, val, al);
        System.out.println(al);
        
        // int k = 2;
        for(int k =0 ;k <=4;k++){
        level(k,root,0);}
    }    

    public static boolean find(Node node, int val){
        if(node == null) return false;

        if(node.data == val){
            return true;
        }
        
        boolean flag1 = find(node.left, val);
        if(flag1 == true){
            return true;
        }

        boolean flag2 = find(node.right, val);
        if(flag2 == true){
            return true;
        }

        return false;
    }

    public static boolean nodeToRootPath(Node node, int val, ArrayList<Integer> al){
        if(node == null) return false;

        if(node.data == val){
            al.add(node.data);
            return true;
        }
        
        boolean flag1 = nodeToRootPath(node.left, val, al);
        if(flag1 == true){
            al.add(node.data);
            return true;
        }

        boolean flag2 = nodeToRootPath(node.right, val, al);
        if(flag2 == true){
            al.add(node.data);
            return true;
        }


        return false;
    }
    
    public static void  level(int k, Node node ,int idx){
        if (node == null ) return ;
        if(idx==k){
            System.out.println(node.data);
        }
        
         level(k,node.left,idx+1);
         level(k,node.right,idx+1);
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
