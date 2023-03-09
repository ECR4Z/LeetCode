import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName: LeetCode0102V1
 * @Description: 二叉树的层序遍历
 * @Author: ECRZ
 * @Date: 2022/7/5
 */
public class LeetCode0102V1 {
    public static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null){
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        // add 入栈 poll 出栈
        queue.add(root);
        while(queue.size()>0){
            List<Integer> res2 = new ArrayList<>();
            int queueSize = queue.size();

            // 每次进的都要在下一次出完
            for (int i = 0; i < queueSize; i++) {
                TreeNode tmp = queue.poll();
                res2.add(tmp.val);
                if (tmp.left!=null){
                    queue.add(tmp.left);
                }

                if (tmp.right!=null){
                    queue.add(tmp.right);
                }
            }

            res.add(res2);
        }

        return res;
    }


    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        TreeNode t9 = new TreeNode(9);
        TreeNode t20 = new TreeNode(20);
        TreeNode t15 = new TreeNode(15);
        TreeNode t7 = new TreeNode(7);

        t1.left = t9;
        t1.right = t20;

        t20.left = t15;
        t20.right = t7;


        List<List<Integer>> sa = levelOrder(t1);
        System.out.println(sa);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
