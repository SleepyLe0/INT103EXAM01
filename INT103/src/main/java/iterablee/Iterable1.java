package iterablee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Iterable1<T> implements Iterable<T> {

    private String name;
    private List<T> array;

    public Iterable1(String name) {
        this.name = name;
        array = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int size() {
        return array.size();
    }

    public void add(T t) {
        array.add(t);
    }

    public void remove(T t) {
        array.remove(t);
    }

    public T find(T t) {
        return array.stream().filter(e -> e.equals(t)).collect(Collectors.toList()).get(0);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < array.size();
            }
            @Override
            public T next() {
                return array.get(index++);
            }
        };
    }

}
