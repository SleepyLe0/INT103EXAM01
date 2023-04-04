package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming1 {

    private int id;
    private String name;
    private List<Obj1> list;

    public FunctionalProgramming1(int id, String name) {
        this.id = id;
        this.name = name;
        list = new ArrayList<>();
    }

    public boolean add(Obj1 t) {
        if (t == null || list.contains(t))
            return false;
        else
            return list.add(t);
    }

    public boolean remove(Obj1 t) {
        return list.remove(t);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void getList() {
        System.out.println(list);
    }

    public void findById(int id) {
        list.stream().filter(x -> x.getId() == id).collect(Collectors.toList());
    }

    public void findByName(String name) {
        System.out.println(list.stream().filter(x -> x.getName().equals(name)).collect(Collectors.toList()));
    }


}
