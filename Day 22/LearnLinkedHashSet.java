import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {

    public static void main(String[] args) {
        
        Set<Integer> set = new LinkedHashSet<>();
        set.add(2);
        set.add(1005);
        set.add(56);
        set.add(20);
        set.add(99);
        System.out.println(set);
        set.remove(56);
        System.out.println(set.contains(100));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
    }
}