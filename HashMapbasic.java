import java.util.HashMap;
import java.util.Map;

public class HashMapbasic {
    public static void main(String[] args) {

        // Create HashMap
        Map<String, String> mapping = new HashMap<>();

        // put() - add key-value
        mapping.put("in", "India");
        mapping.put("en", "England");
        mapping.put("us", "United States");

        System.out.println("Mapping: " + mapping);

        // Second HashMap
        Map<String, String> table = new HashMap<>();

        table.put("br", "Brazil");

        System.out.println("Before: " + table);

        // putAll() 
        table.putAll(mapping);

        System.out.println("After putAll: " + table);

        // remove() 
        table.remove("en");

        System.out.println("After remove: " + table);

        // get() 
        System.out.println("Value of in: " + table.get("in"));

        // containsKey() 
        System.out.println("Contains key 'us': " + table.containsKey("us"));

        // containsValue() 
        System.out.println("Contains value 'India': " 
                + table.containsValue("India"));

        // size() 
        System.out.println("Size: " + table.size());

        // isEmpty() 
        System.out.println("Is Empty: " + table.isEmpty());

        // replace() 
        table.replace("in", "Bharat");

        System.out.println("After replace: " + table);

        // put() 
        table.put("us", "USA");

        System.out.println("After updating us: " + table);

        // keySet() 
        System.out.println("Keys: " + table.keySet());

        // values() 
        System.out.println("Values: " + table.values());

        // entrySet() 
        System.out.println("Entries: " + table.entrySet());

        // clear() 
        table.clear();

        System.out.println("After clear: " + table);

        // Check empty
        System.out.println("Is Empty: " + table.isEmpty());
    }
}