package generic;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Obj1 obj1 = new Obj1(1, "Kun");
        Obj1 obj2 = new Obj1(2, "Gunnie");
        Obj2 obj3 = new Obj2(1, "Arm");
        Obj2 obj4 = new Obj2(2, "Armmy");
        generic1<Obj1> g1 = new generic1<>(10);
        generic1<Obj2> g2 = new generic1<>(10);
        System.out.println(g1.add(obj1));
        System.out.println(g1.add(obj2));
        System.out.println(g2.add(obj3));
        System.out.println(g2.add(obj4));
        System.out.println(Arrays.toString(g1.getArray()));
        System.out.println(Arrays.toString(g2.getArray()));
        generic1<String> g3 = new generic1<>(10);
        g3.add("ONE");
    }
}
