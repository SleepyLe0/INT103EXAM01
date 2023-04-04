package innernested;

public class Test {

    public static void main(String[] args) {
        Outer1 myOuter = new Outer1();
        Outer1.Inner myInner = myOuter.new Inner();
        myInner.display();
        Outer2 myOuter2 = new Outer2();
        Outer2.NestedClass myNested = new Outer2.NestedClass();
        myNested.display();
    }

}
