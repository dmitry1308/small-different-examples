package shchepin.examples.getClassByName;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String name = main.getClass().getPackage().getName();
        System.out.println(name);

        int i=1;
        HashMap<Integer, String> map = new HashMap<>();
        map.put(i, "1");
        map.put(i, "two");
        System.out.println(map);
//1


    }
}
