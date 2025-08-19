package CollectionsDemo.QueDemos;

import java.util.PriorityQueue;

public class PriorityQueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(23);
        pq.offer(13);
        pq.offer(20);
        pq.offer(63);
        pq.offer(28);
        pq.offer(43);
        pq.offer(26);
        pq.offer(12);
        // 12 , 13 , 20 , 23 , 26, 28 , 43, 63

        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
