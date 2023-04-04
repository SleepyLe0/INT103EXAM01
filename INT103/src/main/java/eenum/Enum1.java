package eenum;

public enum Enum1 {

    Kun(1,"Kun"),
    Li(2,"Li"),
    Wang(3,"Wang"),
    Zhang(4,"Zhang"),
    Chen(5,"Chen"),
    Yang(6,"Yang"),
    Zhao(7,"Zhao"),
    Liang(8,"Liang"),
    Wu(9,"Wu");

    private int id;
    private String name;

    Enum1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
