package set;

public class objSet implements Comparable<objSet> {

    private final int id;
    private final String name;

    public objSet(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static int compareById(objSet o1, objSet o2) {
        return o1.getId() - o2.getId();
    }

    @Override
    public String toString() {
        return String.format("Object : id[%d] name[%s]", id, name);
    }

    @Override
    public int compareTo(objSet o) {
        return name.compareTo(o.getName());
    }
}
