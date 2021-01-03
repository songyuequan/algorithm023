/**
 *  翻转二叉树
 *  https://leetcode-cn.com/problems/invert-binary-tree/
 */
public class No226_InvertBinaryTree {
    /**
     * 由于树的数据结构的特性和本身算法特点，解法基本上都是递归的
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
