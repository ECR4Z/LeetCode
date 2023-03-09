import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: LeetCode0589V1
 * @Description: N 叉树的前序遍历
 * @Author: ECRZ
 * @Date: 2022/7/1
 */
public class LeetCode0589V1 {
    public static List<Integer> sa = new ArrayList<>();

    public static List<Integer> preorder(Node root) {
        if (root == null) {
            return sa;
        }
        System.out.println(root.val);
        sa.add(root.val);

        if (root.children != null) {
            for (Node temp : root.children) {
                preorder(temp);
            }
        }


        return sa;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);


        List<Node> s1 = new ArrayList<>();
        List<Node> s2 = new ArrayList<>();

        s1.add(node3);
        s1.add(node2);
        s1.add(node4);

        s2.add(node5);
        s2.add(node6);


        root.children = s1;
        node3.children = s2;

        preorder(root);
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
