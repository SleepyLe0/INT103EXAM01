package superclass;

public class SubClass2 extends SuperClass {

    private double weight;

    public SubClass2(int id, String name, String school, double weight) {
        super(id, name, school);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
