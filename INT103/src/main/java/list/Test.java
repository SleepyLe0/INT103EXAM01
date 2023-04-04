package list;

public class Test {

    public static void main(String[] args) {
        List1 l1 = new List1(1, "List1");
        l1.add(124);
        l1.add(256);
        l1.add(387);
        l1.add(498);
        l1.view();
        l1.remove(124);
        l1.view();
    }
}
