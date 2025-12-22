/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    int[] index = {0};

    public TreeNode bstFromPreorder(int[] preorder) {
        return construct(preorder, index, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode construct(int[] preorder, int[] index, int min, int max) {

        if (index[0] >= preorder.length)
            return null;

        int val = preorder[index[0]];

        if (val < min || val > max)
            return null;

        TreeNode root = new TreeNode(val);
        index[0]++;

        root.left = construct(preorder, index, min, root.val);
        root.right = construct(preorder, index, root.val, max);

        return root;
    }
}
