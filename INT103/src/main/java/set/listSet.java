package set;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class listSet  {

    private Set<objSet> set;

    public listSet() {
        set = new HashSet<>();
    }

    public void addSet(objSet o) {
        set.add(o);
    }

    public void removeSet(objSet o) {
        set.remove(o);
    }

    public void viewSet() {
        System.out.println(set);
    }

    public Set<objSet> getSet() {
        return set;
    }

    public Set<objSet> sortById() {
        return set.stream()
                .sorted(objSet::compareById)
                .collect(Collectors.toSet());
    }

    public Set<objSet> sortByName() {
        return set.stream()
                .sorted(objSet::compareTo)
                .collect(Collectors.toSet());
    }
}
