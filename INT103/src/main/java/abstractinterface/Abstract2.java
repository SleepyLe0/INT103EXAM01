package abstractinterface;

public class Abstract2 extends Abstract1 {

    private String name;

    public Abstract2(String race,String name) {
        super(race);
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is running");
    }



}
