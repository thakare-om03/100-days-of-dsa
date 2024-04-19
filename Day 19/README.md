## Day 19: DequeuesJava and the Java Collections Framework

Today, we ventured into the realm of Deques (pronounced "deck"), a versatile data structure that combines functionalities of both Queues and Stacks. However, Java's built-in Collections Framework doesn't provide a direct `ArrayDeque` class as some other languages might.

* **Deque (Double-Ended Queue):**
  * Offers flexibility to add and remove elements from both ends (front and back).
  * Generalizes the concept of Queues (FIFO) and Stacks (LIFO).

* **Common Deque Operations (using LinkedList):**
  - `addFirst(element)`: Adds an element at the front of the Deque.
  - `addLast(element)`: Adds an element at the back of the Deque.
  - `pollFirst()`: Removes and returns the element from the front, or `null` if empty.
  - `pollLast()`: Removes and returns the element from the back, or `null` if empty.
  - `peekFirst()`: Returns the element at the front without removal.
  - `peekLast()`: Returns the element at the back without removal.