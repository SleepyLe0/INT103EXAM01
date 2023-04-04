package abstractinterface;

public class Interface2 implements Interface1 {

    private String race;
    private String name;

    public Interface2(String race, String name) {
        this.race = race;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(race + " is running");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating");
    }
}
