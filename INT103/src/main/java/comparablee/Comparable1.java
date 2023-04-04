package comparablee;

public class Comparable1 implements Comparable<Comparable1> {

    private int id;
    private String name;

    public Comparable1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static int compareById(Comparable1 o1, Comparable1 o2) {
        return o1.id - o2.id;
    }

    @Override
    public int compareTo(Comparable1 o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Compareble1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
