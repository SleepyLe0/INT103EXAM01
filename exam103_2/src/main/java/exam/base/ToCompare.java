package exam.base;

public class ToCompare implements Comparable<ToCompare> { // implements Comparable so that two ToCompare objects can be compared by name
    private final int value;
    private final String name;

    public ToCompare(int v, String n) { value = v; name = n; }
    @Override public String toString() { return "ToCompare(" + value + ":" + name + ")"; }

    // implement this method so that two ToCompare objects can be compared by ###value####
    public static int compareByValue(ToCompare o1, ToCompare o2) {
        return Integer.compare(o1.value, o2.value); // modify this line
    }
    // return -1 if this < o, 0 if this == o, 1 if this > o
    @Override
    public int compareTo(ToCompare o) {
        return name.compareTo(o.name);
    }

}


