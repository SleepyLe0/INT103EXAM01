package exam.base;

// change this class to be an enum
public enum ToBeEnum {

    // PTSD Blackjack
    FRESHMAN(1, "Freshman"),
    SOPHOMORE(2, "Sophomore"),
    JUNIOR(3, "Junior"),
    SENIOR(4, "Senior");

    private final int year;
    private final String name;

    ToBeEnum(int year, String name) {
        this.year = year;
        this.name = name;
    }

    public int getYear() { return year; }
    public String getName() { return name; }
    @Override public String toString() { return "ToBeEnum(" + year + ":" + name + ")"; }
}

