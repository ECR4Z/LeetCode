import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: LeetCode0094V1
 * @Description: 二叉树的中序遍历
 * @Author: ECRZ
 * @Date: 2022/7/18
 */
public class LeetCode0094V1 {
    public static List<Integer> arr = new ArrayList<>();
    public static List<Integer> inorderTraversal(TreeNode0094 root) {
        if (root==null){
            return arr;
        }
        inorderTraversal(root.left);
        arr.add(root.val);
        inorderTraversal(root.right);
        return arr;
    }

    public static void main(String[] args) {

    }
}

class TreeNode0094 {
    int val;
    TreeNode0094 left;
    TreeNode0094 right;

    TreeNode0094() {
    }

    TreeNode0094(int val) {
        this.val = val;
    }

    TreeNode0094(int val, TreeNode0094 left, TreeNode0094 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
