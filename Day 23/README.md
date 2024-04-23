## Day 23: Maps in Java

Today's study focused on Maps in Java, which provide key-value pair storage and retrieval.

* **Maps:**
    * Data structures that store elements as key-value pairs.
    * Allow efficient access to elements based on their keys.

* **Java's Map Interface and Implementations:**
    * The `Map` interface in `java.util` defines core Map operations.
    * Common implementations include:
        * `HashMap`: Most popular choice for general-purpose Maps, offering average performance due to its hashing mechanism.
        * `TreeMap`: Maintains elements in a sorted order based on keys, enabling efficient retrieval based on order.
        * `LinkedHashMap`: Maintains the insertion order while providing key-value uniqueness, useful when order preservation is important.

* **Basic Map Operations:**
    * `put(key, value)`: Inserts a key-value pair into the map.
    * `get(key)`: Retrieves the value associated with a given key.
    * `containsKey(key)`: Checks if a specific key exists in the map.
    * `remove(key)`: Removes the key-value pair associated with a given key.