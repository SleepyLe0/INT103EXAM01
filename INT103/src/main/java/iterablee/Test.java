package iterablee;

import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        Iterable1<String> iterable1 = new Iterable1<>("Arrays of Strings");
        Iterable1<Integer> iterable2 = new Iterable1<>("Arrays of Strings");
        iterable1.add("one");
        iterable1.add("two");
        iterable1.add("three");
        iterable1.add("four");
        iterable1.add("five");
        iterable2.add(1);
        iterable2.add(2);
        iterable2.add(3);
        iterable2.add(4);
        iterable2.add(5);
        Iterator<String> iterator1 = iterable1.iterator();
        Iterator<Integer> iterator2 = iterable2.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
