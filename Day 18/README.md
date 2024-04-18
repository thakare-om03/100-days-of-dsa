## Day 18: Queues and the Java Collections Framework

Today, I explored Queues, another fundamental data structure offered by the Java Collections Framework. Let's dive in!

* **Queues:**
  * FIFO (First-In-First-Out) data structures.
  * Elements are added to the back (enqueue) and removed from the front (dequeue), mimicking a real-world queue (like a line of people).

* **Java's Queue Interface and Implementations:**
  * The `Queue` interface in `java.util` defines the core Queue operations.
  * Common implementations include:
    * `LinkedList`: A flexible choice due to its underlying linked list structure, efficient for enqueue/dequeue.
    * `PriorityQueue`: Maintains a sorted order based on a custom comparator (useful for prioritizing elements).

* **Basic Queue Operations:**
  * `offer(element)`: Attempts to add an element to the back of the queue (returns `true` if successful, `false` otherwise).
  * `poll()`: Removes and returns the element from the front of the queue, or `null` if empty.
  * `peek()`: Returns the element at the front of the queue without removal.

**Common Use Cases of Queues:**

* **Task scheduling:** Queues are often used to manage tasks to be processed in a specific order.
* **Breadth-first search algorithms:** Traversal techniques in graphs and trees frequently rely on Queues.
* **Event handling:** Queues can buffer events for asynchronous processing.