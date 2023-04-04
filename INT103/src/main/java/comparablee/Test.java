package comparablee;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Comparable1 c1 = new Comparable1(1, "Brmmys");
        Comparable1 c2 = new Comparable1(2, "Crmmys");
        Comparable1 c3 = new Comparable1(3, "Drmmys");
        Comparable1 c4 = new Comparable1(4, "Armmys");
        Comparable1 c5 = new Comparable1(5, "Ermmys");
        Comparable1[] cmps = {c5, c2, c1, c3, c4};
        System.out.println(Arrays.toString(cmps));
        Arrays.sort(cmps); // Comparable
        System.out.println(Arrays.toString(cmps));
        Arrays.sort(cmps, Comparable1::compareById); // Comparator
        System.out.println(Arrays.toString(cmps));
    }
}
