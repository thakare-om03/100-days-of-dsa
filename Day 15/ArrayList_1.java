import java.util.ArrayList;
import java.util.*;

public class ArrayList_1 {
    public static void main(String[] args) {
        // Creating an ArrayList to hold Integer values
        ArrayList<Integer> rollno = new ArrayList<Integer>();

        // Adding elements to the ArrayList
        rollno.add(1);
        rollno.add(2);
        rollno.add(3);
        rollno.add(4);
        rollno.add(5);

        // Printing the ArrayList
        System.out.println(rollno);

        // Adding another element to the ArrayList
        rollno.add(6);

        // Printing the updated ArrayList
        System.out.println(rollno);

        // Adding an element at a specific index in the ArrayList
        rollno.add(6, 7);

        // Printing the updated ArrayList
        System.out.println(rollno);

        // Creating another ArrayList to hold Integer values
        ArrayList<Integer> rollno2 = new ArrayList<Integer>();

        // Adding elements to the second ArrayList
        rollno2.add(8);
        rollno2.add(9);

        // Adding all elements of rollno2 to rollno
        rollno.addAll(rollno2);

        // Printing the updated ArrayList rollno
        System.out.println(rollno);

        // Getting and printing an element at a specific index in the ArrayList
        System.out.println(rollno.get(2));

        // Removing an element by its value (not by index) from the ArrayList
        rollno.remove(8);
        System.out.println(rollno);

        // Removing an element by its value using Integer.valueOf to get the correct
        // object
        rollno.remove(Integer.valueOf(8));
        System.out.println(rollno);

        // Clearing all elements from rollno2
        rollno2.clear();
        System.out.println(rollno2);

        // Replacing an element at a specific index in the ArrayList
        rollno.set(0, 100);
        System.out.println(rollno);

        // Checking if the ArrayList contains a specific value (returns boolean)
        rollno.contains(500);
        System.out.println(rollno);

        // Looping through the ArrayList using a traditional for loop
        for (int i = 0; i < rollno.size(); i++) {
            System.out.println("Elements are : " + rollno.get(i));
        }

        // Looping through the ArrayList using for-each loop
        for (Integer element : rollno) {
            System.out.println("Foreach element is : " + element);
        }

        // Using an Iterator to iterate over the ArrayList
        Iterator<Integer> it = rollno.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator : " + it.next());
        }
    }
}