package eenum;

public class Test {

    public static void main(String[] args) {
        Enum1[] values = Enum1.values();
        for (Enum1 value : values) {
            System.out.println(value.getId() + " " + value.getName());
        }
    }
}
