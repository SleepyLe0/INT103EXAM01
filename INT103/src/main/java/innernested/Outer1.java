package innernested;

public class Outer1 {

    private static int outerStaticVar1 = 1;
    private int outerPrivateVar1 = 2;
    int outerInstanceVar1 = 3;

    public class Inner { //A non-static nested class is an inner class.
        public void display() {
            System.out.println("Outer Static Variable = " + outerStaticVar1);
            System.out.println("Outer Private Variable = " + outerPrivateVar1);
            System.out.println("Outer Instance Variable = " + outerInstanceVar1);
            run();
        }
    }

    public void run() {
        System.out.println("Running");
    }
}
