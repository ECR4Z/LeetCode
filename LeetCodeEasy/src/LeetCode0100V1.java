import java.util.List;

/**
 * @ClassName: LeetCode0100V1
 * @Description: 相同的树
 * @Author: ECRZ
 * @Date: 2022/7/27
 */
public class LeetCode0100V1 {
    public static void main(String[] args) {
        TreeNode0100 root = new TreeNode0100(1);
        TreeNode0100 left = new TreeNode0100(2);
        TreeNode0100 right = new TreeNode0100(3);

        root.left = left;
        root.right = right;

        System.out.println(isSameTree(root,root));

    }

    public static boolean isSameTree(TreeNode0100 p, TreeNode0100 q) {
        if (p==null&q==null){
            return true;
        }

        if (p==null&q!=null){
            return false;
        }

        if (p!=null&q==null){
            return false;
        }

        if (p.val!=q.val){
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

class TreeNode0100 {
    int val;
    TreeNode0100 left;
    TreeNode0100 right;

    TreeNode0100() {
    }

    TreeNode0100(int val) {
        this.val = val;
    }

    TreeNode0100(int val, TreeNode0100 left, TreeNode0100 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}