package abstractinterface;

public abstract class Abstract1 {

    private String race;

    public Abstract1(String race) {
        this.race = race;
    }

    public abstract void run();

    public void eat() {
        System.out.println(race + " is eating");
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

}
