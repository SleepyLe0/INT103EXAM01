package exam.base;

import java.util.Comparator;
import java.util.function.Predicate;

public class ToBeLambda {
    private final String firstname;
    private final String lastname;
    
    public ToBeLambda(String fn, String ln) {
        firstname = fn; lastname = ln;
    }
    @Override public String toString() {
        return "ToBeLambda(" + firstname + ":" + lastname + ")";
    }
    
    // replace null with a lambda expression to compare objects by the firstname
    public static Comparator<ToBeLambda> compareByFirstname = ((x, y) -> x.firstname.compareTo(y.firstname));
    
    public boolean evalFirstname(Predicate<String> p) { return p.test(firstname); }
}
