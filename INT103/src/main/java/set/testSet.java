package set;

import java.util.Comparator;

public class testSet { //Main Point : Set similar to List but 1.Set cannot store the same value 2.Set not order the elements(No Index)

    public static void main(String[] args) {
        objSet o1 = new objSet(1,"Kun");
        objSet o2 = new objSet(2,"Tum");
        objSet o3 = new objSet(3,"First");
        objSet o4 = new objSet(4,"Book");
        objSet o5 = new objSet(5,"Kong");
        objSet o6 = new objSet(6,"Arm");
        listSet l1 = new listSet();
        l1.addSet(o1);
        l1.addSet(o2);
        l1.addSet(o3);
        l1.addSet(o3);
        l1.addSet(o4);
        l1.addSet(o5);
        l1.addSet(o6);
        l1.viewSet();
        l1.getSet()
                .stream()
                .sorted(Comparator.comparingInt(objSet::getId))
                .forEach(System.out::print);
    }
}
