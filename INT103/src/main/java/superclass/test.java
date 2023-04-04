package superclass;

public class test {

    public static void main(String[] args) {
        SubClass1 sub1 = new SubClass1(1, "John", "SIT", 180.0);
        SubClass2 sub2 = new SubClass2(2, "Mary", "SIT", 60.0);
        System.out.println(sub1.getId());
        System.out.println(sub2.getId());
        System.out.println(sub1.getHeight());
        System.out.println(sub2.getWeight());
    }
}
