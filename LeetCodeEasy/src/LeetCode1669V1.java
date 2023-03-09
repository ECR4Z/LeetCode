/**
 * @ClassName: LeetCode1669V1
 * @Description: 1669. 合并两个链表
 * @Author: ECRZ
 * @Date: 2023/1/30
 * @Notes: TODO
 */
public class LeetCode1669V1 {

    public static ListNode1669 mergeInBetween(ListNode1669 list1, int a, int b, ListNode1669 list2) {
        // 0 1 2 3 4 5
        // 3,4
        ListNode1669 temp = list1;
        int count = 0;

        ListNode1669 startNode = null;
        ListNode1669 endNode = null;
        ListNode1669 tail = null;
        while (temp != null){
            if (count == a - 1){
                startNode = temp;
            }

            if (count == b + 1){
                endNode = temp;
            }

            temp = temp.next;
            count++;
        }

        ListNode1669 temp2 = list2;
        while (temp2 != null){
            if (temp2.next == null){
                tail = temp2;
            }

            temp2 = temp2.next;

        }
        // 找到list1的尾指针
        startNode.next = list2;
        tail.next = endNode;
        // endNode.next = tail;
        // list2.next = endNode;

        return list1;
    }

    public static void main(String[] args) {
        ListNode1669 node00 = new ListNode1669(0);
        ListNode1669 node01 = new ListNode1669(1);
        ListNode1669 node02 = new ListNode1669(2);
        ListNode1669 node03 = new ListNode1669(3);
        ListNode1669 node04 = new ListNode1669(4);
        ListNode1669 node05 = new ListNode1669(5);

        node00.next = node01;
        node01.next = node02;
        node02.next = node03;
        node03.next = node04;
        node04.next = node05;


        ListNode1669 nodeL21 = new ListNode1669(111);
        ListNode1669 nodeL22 = new ListNode1669(222);

        nodeL21.next = nodeL22;

        ListNode1669 list1 = mergeInBetween(node00,3,4,nodeL21);

        while (list1 != null){
            System.out.println(list1.val);
            list1 = list1.next;
        }
    }
}

class ListNode1669 {
    int val;
    ListNode1669 next;

    ListNode1669() {
    }

    ListNode1669(int val) {
        this.val = val;
    }

    ListNode1669(int val, ListNode1669 next) {
        this.val = val;
        this.next = next;
    }
}
