package methodreference;

public class Test {

    public static void main(String[] args) {
        MethodReference1 mr1 = new MethodReference1(1, "name");
        mr1.add("one");
        mr1.add("two");
        mr1.add("three");
        mr1.add("four");
        mr1.add("five");
        mr1.print(); // method reference
    }
}
