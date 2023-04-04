package lambda;

import java.util.Comparator;

public class Lambda1 {

    private int id;
    private String name;

    public Lambda1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static Comparator<Lambda1> compareById
            = (o1, o2) -> o1.id - o2.id;

    public static Comparator<Lambda1> compareByName
            = (o1, o2) -> o1.name.compareTo(o2.name);

    @Override
    public String toString() {
        return String.format("id[%d] name[%s]", id, name);
    }
}
