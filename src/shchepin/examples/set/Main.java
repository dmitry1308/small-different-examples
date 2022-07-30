package shchepin.examples.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        int i = 00000001 << 3;
        System.out.println(i);

        TreeSet<People> treeSet = new TreeSet<People>(Comparator.comparingDouble(value -> value.age));
        treeSet.add(new People("Dima", 25));
        treeSet.add(new People("Diman", 23));
        treeSet.add(new People("Dima", 25));
        treeSet.add(new People("Ann", 25));

        Iterator<People> iterator = treeSet.iterator();

        System.out.println(treeSet);


        ArrayList<Integer> objects = new ArrayList<>();
        List<Integer> objects1 = Collections.synchronizedList(objects);
        objects1.add(1);


        LinkedList<Integer> objects2 = new LinkedList<>();
        objects2.add(2);
        Integer peek = objects2.peek();
        System.out.println(peek);
        Integer integer = objects2.pollFirst();
        System.out.println(integer);
        System.out.println(objects2.size());

        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

    }


    static class People {
        private String name;
        private int    age;

        public People(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "People{" + "name='" + name + '\'' + ", age=" + age + '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            People people = (People) o;
            return age == people.age && Objects.equals(name, people.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }
}
