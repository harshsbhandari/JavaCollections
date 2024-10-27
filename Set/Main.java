package Set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();

//        1. Add item in set
        st.add(1);
        st.add(1);
        st.add(2);

//        2. Size of set
        int n = st.size();
        System.out.println("Size of set - " + n);

//        3. Print the set
        for (Integer i : st)
            System.out.println(i);

//        4. Check if item occurs in the set
        if (st.contains(1))
            System.out.println("1 exists in the set");

//        5. Remove item from set
        st.remove(1);
        if (!st.contains(1))
            System.out.println("Set do not contains 1");
    }
}
