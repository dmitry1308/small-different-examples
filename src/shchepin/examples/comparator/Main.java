package shchepin.examples.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Random             random = new Random(2664);
        IntStream          ints   = random.ints(32_000_000L, 1000, 110_000);
        ArrayList<Integer> list   = ints.boxed().collect(Collectors.toCollection(ArrayList::new));
        //list.sort((x, y) -> (x < y) ? -1 : ((x == y) ? 0 : 1));

        //Collections.sort(list, new BatchQuantComparator());
        System.out.println(list.size());
//        System.out.println(list);

        List<Integer> integers = Arrays.asList(5, 5, 5, 5, 5, 5, 2,2,2,5,5,5,5,5,5,5,2,2,2,2);
        Collections.sort(integers, new BatchQuantComparator());
    }

    protected static class BatchQuantComparator extends Random implements Comparator<Integer> {

        @Override
        public int compare(Integer x, Integer y) {
            //int i = (x < y) ? -1 : ((x == y) ? 0 : 1);
            //System.out.println(x + "   " + y + "  " + i);
            //return (x < y) ? -1 : ((x > y) ? 1 : 0);
            int i;
            try {
                System.out.println("вар1 x:"+x + " y:"+y);
                i = (x < y) ? -1 : ((x == y) ? 0 : 1);
            } catch (Exception e) {
                System.out.println("x:"+x + " y:"+y);
                try {
                    System.out.println("вар2 x:"+x + " y:"+y);
                    i = (x < y) ? -1 : ((x == y) ? 0 : 1);
                } catch (Exception e2) {
                    System.out.println("x:"+x + " y:"+y);
i=0;
                }
            }

            return i;
        }


    }
}
