package lambda;


import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Lambda1 l1 = new Lambda1(1, "Armmy");
        Lambda1 l2 = new Lambda1(2, "Gunnie");
        Lambda1 l3 = new Lambda1(3, "Tum");
        Lambda1 l4 = new Lambda1(4, "Booklyn");
        Lambda1[] l = {l4,l2,l3,l1};
        System.out.println("Unsorted ---------------------");
        for (Lambda1 x : l) {
            System.out.println(x);
        }
        System.out.println();
        System.out.println("Sorted By Id ---------------------");
        Arrays.sort(l, Lambda1.compareById);
        for (Lambda1 x : l) {
            System.out.println(x);
        }
        System.out.println();
        System.out.println("Sorted By Name ---------------------");
        Arrays.sort(l, Lambda1.compareByName);
        for (Lambda1 x : l) {
            System.out.println(x);
        }
        System.out.println();
    }
}
