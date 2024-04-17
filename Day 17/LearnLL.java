import java.util.LinkedList;

public class LearnLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        // Adding elements to the linked list
        ll.addFirst(5); // Adds 5 at the beginning of the list
        ll.addLast(60); // Adds 60 at the end of the list
        ll.add(2, 25); // Adds 25 at index 2

        // Removing elements from the linked list
        ll.removeFirst(); // Removes the first element from the list
        ll.removeLast(); // Removes the last element from the list
        ll.remove(2); // Removes the element at index 2

        // Accessing elements in the linked list
        ll.get(2); // Retrieves the element at index 2

        // Updating elements in the linked list
        ll.set(1, 15); // Updates the element at index 1 to 15

        // Checking if the linked list contains an element
        ll.contains(30); // Returns true if the list contains 30

        // Getting the size of the linked list
        ll.size(); // Returns the number of elements in the list

        // Clearing the linked list
        ll.clear(); // Removes all elements from the list
    }
}