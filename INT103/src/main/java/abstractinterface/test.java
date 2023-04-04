package abstractinterface;

public class test {

    public static void main(String[] args) {
        Abstract2 a = new Abstract2("human", "Jack");
        a.run();
        a.eat();
        Interface2 i = new Interface2("demon", "Jackie");
        i.run();
        i.eat();
    }
}
