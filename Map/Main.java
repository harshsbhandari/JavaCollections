package Map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> mp = new HashMap<>();
        String s = "apple";

//        1. Count occurrences in a map
        for (int i = 0; i < s.length(); i++)
            mp.put(s.charAt(i), 1 + mp.getOrDefault(s.charAt(i), 0));

//        2. Iterate a map
        for (Character key : mp.keySet()){
            Integer value = mp.get(key);
            System.out.println("Key - " + key + " " + "Value - " + value);
        }

//        3. Key exists in the map
        if (mp.containsKey('a'))
            System.out.println("Character 'a' exists in the map");

//        4. Delete a key from map
        mp.remove('a');
        if (!mp.containsKey('a'))
            System.out.println("Map does not contains 'a' as a key");
    }
}
