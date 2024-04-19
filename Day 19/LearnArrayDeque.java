import java.util.ArrayDeque;

public class LearnArrayDeque {

    public static void main(String[] args) {
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        deq.offer(10);
        deq.offerFirst(5);
        deq.offerLast(15);
        deq.add(20);
        deq.add(25);

        System.out.println("Elements in the deque: " + deq);
        System.out.println("Polled element: " + deq.poll());
        System.out.println("Polled first element: " + deq.pollFirst());
        System.out.println("Polled last element: " + deq.pollLast());
        System.out.println("Peeked element: " + deq.peek());
        System.out.println("Peeked first element: " + deq.peekFirst());
        System.out.println("Peeked last element: " + deq.peekLast());
    }
}
