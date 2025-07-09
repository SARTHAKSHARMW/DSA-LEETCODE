import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < stones.length; i++) {
            pq.add(stones[i]);
        }

        while (pq.size() > 1) {
            int max = pq.remove();
            int smax = pq.remove();

            int nstone = max - smax;

            if (nstone != 0) {
                pq.add(nstone);
            }
        }

        if (pq.size() == 0) {
            return 0;
        } else {
            return pq.peek(); // or return pq.remove();
        }
    }
}



       