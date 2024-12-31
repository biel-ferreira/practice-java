package je29_arrays;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List <Integer> testArray = new ArrayList();
        testArray.add(10);
        testArray.add(20);
        testArray.add(30);
        testArray.add(40);
        testArray.add(50);

        testArray.remove(2);

        for (Integer number: testArray) {
            System.out.println(number);
        }
    }
}
