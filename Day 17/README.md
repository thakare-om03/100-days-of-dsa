## Day 17: Introduction to Linked Lists in Java Collections Framework

Today, I journeyed into the Linked Lists, another fundamental data structure within the Java Collections Framework. Here's an overview of what I discovered:

* **Linked Lists:**
  * Linear data structures where elements are not stored in contiguous memory locations.
  * Each element (node) contains data and a reference to the next node in the sequence.
  * Offer dynamic resizing capabilities, as nodes can be added or removed anywhere in the list without major shuffling.
* **Node Structure:**
  * A basic building block of a Linked List.
  * Typically consists of two fields:
    * Data field to store the element value.
    * Reference field (often called `next`) pointing to the next node in the list.
* **LinkedList Class:**
  * Java provides the `LinkedList` class (`java.util`) to implement Linked Lists.
  * Offers methods for adding, removing, and accessing elements. 
* **Basic Operations:**
  * `add(element)`: Adds an element to the end of the list (by default).
  * `addFirst(element)`: Adds an element to the beginning of the list.
  * `remove()`: Removes the first element from the list.
  * `get(index)`: Retrieves an element based on its index (might be slower than Array Lists).
* **Advantages of Linked Lists:**
  * Efficient insertion and deletion at any position.
  * No need for contiguous memory allocation (good for memory-intensive applications).