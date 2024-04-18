import java.util.Queue;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class LearnQueue {
    public static void main(String[] args) {
        // Creating a LinkedList-based Queue
        Queue<Integer> q = new LinkedList<>();
        
        // Adding elements to the queue
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println("Elements in the queue are : " + q);
        
        // Adding elements to the queue using offer()
        q.offer(60);
        q.offer(70);
        System.out.println("Elements in the queue after offer are : " + q);
        
        // Removing and retrieving elements from the queue using poll()
        q.poll();
        System.out.println(q.poll());
        
        // Retrieving the head of the queue without removing it using peek()
        System.out.println(q.peek());
        
        // Retrieving the head of the queue without removing it using element()
        System.out.println(q.element());
        
        // Removing and retrieving the head of the queue using remove()
        System.out.println(q.remove());

        // Creating a PriorityQueue with reverse ordering
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        // Adding elements to the priority queue
        pq.add(15);
        pq.add(10);
        pq.add(22);
        System.out.println("Elements in the priority queue are : " + pq);
        
        // Adding elements to the priority queue using offer()
        pq.offer(80);
        pq.offer(91);
        System.out.println("Elements in the priority queue after offer are : " + pq);
        
        // Removing and retrieving elements from the priority queue using poll()
        pq.poll();
        System.out.println(pq);
    }
}