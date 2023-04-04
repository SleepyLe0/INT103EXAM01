package innernested;

public class Outer2 {
    private static int outerStaticVar2 = 1;
    private static int outerPrivateVar2 = 2;
    static int outerInstanceVar2 = 3;

    public static class NestedClass { // A static nested class is a nested class which is a static member of the outer class.
        public void display() {
            System.out.println("Outer Static Variable = " + outerStaticVar2);
            System.out.println("Outer Private Variable = " + outerPrivateVar2);
            System.out.println("Outer Instance Variable = " + outerInstanceVar2);
            run();
        }
    }

    public static void run() {
        System.out.println("Running");
    }


}
