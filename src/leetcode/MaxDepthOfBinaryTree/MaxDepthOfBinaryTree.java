package leetcode.MaxDepthOfBinaryTree;

/**
 * \* User: sky
 * \* Date: 2019/6/12
 * \* Time: 14:37
 * \* Description: maxdepthofbinaryTree 递归
 * \
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
public class MaxDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(3);
        System.out.println(maxDepth(treeNode));
    }
    public static int maxDepth(TreeNode root) {
        if (root  == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return left >= right ? left + 1 : right + 1;
    }
}