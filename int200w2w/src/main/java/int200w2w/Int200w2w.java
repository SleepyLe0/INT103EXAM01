package int200w2w;

import collection.MultiSet;

public class Int200w2w {

    public static void main(String[] args) {
       testMultiSet();
    }
    static void testMultiSet() {
       MultiSet<String> s = new MultiSet<>();
       System.out.println("multiset: " + s);
       System.out.println("add one: " + s.add("one"));
       System.out.println("add two: " + s.add("two"));
       System.out.println("add three: " + s.add("three"));
       System.out.println("add one: " + s.add("one"));
       System.out.println("add two: " + s.add("two"));
       System.out.println("add one: " + s.add("one"));
       System.out.println("multiset: " + s);
       System.out.println("remove four: " + s.remove("four"));
       System.out.println("remove one: " + s.remove("one"));
       System.out.println("multiset: " + s);
       System.out.println("remove two: " + s.remove("two"));
       System.out.println("multiset: " + s);
       System.out.println("remove two: " + s.remove("two"));
       System.out.println("multiset: " + s);
       System.out.println("remove three: " + s.remove("three"));
       System.out.println("multiset: " + s);
    }
}
