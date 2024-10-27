package List;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        /* List (1D) operations */

//        1. Add item in a list
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(10);

//        2. Size of list
        int n = arr.size();

//        3. Printing a list
        for (int i = 0; i < n; i++)
            System.out.println(arr.get(i));

//        4. Update at an index
        arr.add(0, 1234);
        System.out.println("First item in the array - " + arr.get(0));

//        5. Empty a list
        arr.clear();

//        6. Make a list of pre-defined size
        List<Integer> newList = new ArrayList<>(5);

        for (int i = 0; i < 5; i++)
            newList.add(i+1);

        printTheList(newList);

//        7. Sort the list - Ascending
        Collections.sort(newList);
        printTheList(newList);

//        8. Sort the list - Descending
        Collections.sort(newList, Collections.reverseOrder());
        printTheList(newList);

        /* Grid or Matrix (2D) operations */

//        9. Grid of predefined size
        List<List<Integer>> grid = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < 5; j++)
                row.add(0);
            grid.add(row);
        }

//        10. Accessing the values of grid
        System.out.println("(0, 0) cell in the grid " + grid.get(0).get(0));

//        11. Set value in grid
        grid.get(0).set(1, 12341234);
        System.out.println("(0, 0) cell in the grid " + grid.get(0).get(1));
    }

    public static void printTheList(@NotNull List<Integer> arr) {
        arr.forEach(i ->  System.out.println(i));
    }
}
