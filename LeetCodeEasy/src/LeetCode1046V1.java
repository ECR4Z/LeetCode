
import java.util.PriorityQueue;

/**
 * @ClassName: LeetCode1046V1
 * @Description: TODO
 * @Author: ECRZ
 * @Date: 2022/7/13
 */
public class LeetCode1046V1 {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
        for (int stone : stones) {
            pq.offer(stone);
        }

        while (pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();
            System.out.printf("a:%d,b:%d\n",a,b);
            if (a > b){
                pq.offer(a-b);
            }
            System.out.println(pq);
        }

        System.out.println(pq);
        return pq.isEmpty()?0:pq.poll();
    }


    public static void main(String[] args) {
        int[] s = new int[]{2, 7, 4, 1, 8, 1};
        lastStoneWeight(s);
    }
}
