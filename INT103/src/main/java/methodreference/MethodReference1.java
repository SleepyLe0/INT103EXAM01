package methodreference;

import java.util.ArrayList;
import java.util.List;

public class MethodReference1 {

    private int id;
    private String name;
    private List<String> list;

    public MethodReference1(int id, String name) {
        this.id = id;
        this.name = name;
        list = new ArrayList<>();
    }

    public void add(String str) {
        list.add(str);
    }

    public void print() {
        list.forEach(System.out::println);
    }
}
