import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Product> maps = new HashMap<>();
        maps.put(2, new Product("doll"));
        maps.put(6, new Product("boll"));
        maps.put(4, new Product("baby"));
        maps.put(9, new Product("teddi"));
        for (Map.Entry<Integer, Product> entry : maps.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        System.out.println("\n");
        maps.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Product>comparingByValue())
                .forEach(System.out::println);
    }
}