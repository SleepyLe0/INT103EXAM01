package exam.base;

public abstract class OrgUnit implements Loggable {

    private final int code;
    private String name;
    protected String logging;

    public OrgUnit(int code, String name) {
        this.code = code;
        this.name = name;
        this.logging = "";
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getLog() {
        return logging;
    }

    @Override
    public void clearLog() {
        logging = "";
    }
}
