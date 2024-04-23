import java.util.*;

public class LearnMaps {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>(); 
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println(numbers);
        if(!numbers.containsKey("Two")){
            numbers.put("Two", 20);
        }
        System.out.println(numbers);
        for(String key : numbers.keySet()){
            System.out.println(key);
        }
        for(Integer value : numbers.values()){
            System.out.println(value);
        }
    }
}
