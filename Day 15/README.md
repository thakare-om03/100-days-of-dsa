## Day 15: Introduction to Array Lists in Java Collections Framework

Today, I explored the fundamentals of Array Lists in Java's Collections Framework. Here's a summary of the key concepts I learned:

* **ArrayLists:**  
  * Resizable collections of objects.
  * Implement the `List` interface, providing functionalities like ordered insertion and retrieval of elements.
  * Maintain an internal array to store elements.
* **Creating Array Lists:**
  * Use the `ArrayList` class from the `java.util` package.
  * Example: `ArrayList<String> names = new ArrayList<>();`
* **Adding Elements:**
  * Use the `add(element)` method to append elements to the end of the list.
  * Allows duplicates.
* **Accessing Elements:**
  * Use the `get(index)` method to retrieve an element based on its index (zero-based).
  * Out-of-bounds access throws an exception.
* **List Size:**
  * Use the `size()` method to get the current number of elements in the list.
* **Iterating over Elements:**
  * Use an `Iterator` object to traverse through elements.