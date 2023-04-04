package superclass;

public class SubClass1 extends SuperClass {

    private double height;

    public SubClass1(int id, String name, String school, double height) {
        super(id, name, school);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
