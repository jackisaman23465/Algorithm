package com.jagertech.algorithm;
 class TreeNode {
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
public class EvaluateTreeAlgorithm {
    static boolean start(TreeNode root){
        int rootVal = root.val;
        int leftVal = root.left.val;
        int rightVal = root.right.val;
        if(leftVal == 2 || leftVal == 3){
            return start(root.left);
        }
        if(rightVal == 2 || rightVal == 3){
            return start(root.right);
        }
        if(rootVal == 2){
            return (leftVal | rightVal) == 1;
        }else{
            return (leftVal & rightVal) == 1;
        }
    }
}
