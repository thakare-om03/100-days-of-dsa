import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animal = new Stack<>();

        animal.push("Lion");
        animal.push("Tiger");
        animal.push("Leopard");
        animal.push("Jaguar");

        System.out.println("Animals in stack " + animal);

        System.out.println("Peek: " + animal.peek());

        animal.pop();
        System.out.println("After pop: " + animal);

        Stack<Integer> numbers = new Stack<>();
        System.out.println("Is stack empty? " + numbers.isEmpty());
    }
}