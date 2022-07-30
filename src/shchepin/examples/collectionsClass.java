package shchepin.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class collectionsClass {
    public static void main(String[] args) {
        List emptyList = Collections.EMPTY_LIST;

        List<String> list = Collections.checkedList(Arrays.asList("1", "2"), String.class);
        List<String> list1 = list;
        Collections.reverse(list1);
        System.out.println(list1);



    }
}
