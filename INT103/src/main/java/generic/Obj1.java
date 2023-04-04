package generic;

public class Obj1 {

    private int id;
    private String name;

    public Obj1(int id, String name) {
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
        return "Obj1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
