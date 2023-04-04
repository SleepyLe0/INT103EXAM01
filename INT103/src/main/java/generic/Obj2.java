package generic;

public class Obj2 {

    private int id;
    private String name;

    public Obj2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Obj2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
