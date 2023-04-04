package list;

import java.util.ArrayList;
import java.util.List;

public class List1 {

    private int id;
    private String name;
    private List<Integer> list;

    public List1(int id, String name) {
        this.id = id;
        this.name = name;
        list = new ArrayList<>();
    }

    public void add(int value) {
        list.add(value);
    }

    private int find(int value) {
        for (Integer i : list) {
            if (i == value) {
                return list.indexOf(i);
            }
        }
        return -1;
    }

    public void remove(int value) {
        int x = find(value);
        if ( x >= 0 ) {
            list.remove(x);
        } else {
            System.out.println("Value not found");
        }
    }

    public void view() {
        System.out.println(list);
    }
}
