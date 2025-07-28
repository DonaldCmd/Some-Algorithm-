import java.util.PriorityQueue;

public class PriorityQueueDemo1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(1);
        pq.add(2);

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " "); // 输出：1 2 3
    }
}
}
