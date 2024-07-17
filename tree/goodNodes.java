// import javax.swing.tree.TreeNode;

// public class goodNodes {
//     public int goodNodes2(TreeNode root) {
//         return dfs(root, root.val);
//     }

//     public static int dfs(TreeNode n ,int max){
//         if(n==null) return 0;
//         if(n.val>=max) {
//             max=Math.max(max, n.val);
//             int res=1;
//         }
//         else res=0;
//         res+= dfs(n.left, max);
//         res+= dfs(n.right, max);

//         return res;
//     }
// }
