package Day;

public class LC2331 {
  
    

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
      }
  }

    public boolean evaluateTree(TreeNode root) {
        
            if(root.left == null && root.right == null) {
                return root.val == 1 ? true: false;
            }



    }
    
}
