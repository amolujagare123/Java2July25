package CollectionsDemo.QueDemos;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ArrayDeQueDemo {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(23);
        adq.offer(13);
        adq.offer(20);
        adq.offer(63);
        adq.offer(28);
        adq.offer(43);
        adq.offer(26);
        adq.offer(12);

        System.out.println(adq);

        adq.offerFirst(0);
        adq.offerLast(100);

        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);


    }
}
