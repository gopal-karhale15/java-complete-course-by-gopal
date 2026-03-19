import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Gopal", 101);
        map.put("Rahul", 102);
        map.put("Amit", 103);

        System.out.println("HashMap Data: " + map);

        // Access value
        System.out.println("Gopal ID: " + map.get("Gopal"));
    }
}
