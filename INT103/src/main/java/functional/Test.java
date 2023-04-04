package functional;

public class Test {

    public static void main(String[] args) {
        Obj1 obj1 = new Obj1(1, "obj1");
        Obj1 obj2 = new Obj1(2, "obj2");
        Obj1 obj3 = new Obj1(3, "obj3");
        Obj1 obj4 = new Obj1(4, "obj1");
        Obj1 obj5 = new Obj1(5, "obj2");
        FunctionalProgramming1 list = new FunctionalProgramming1(1,"ObjList");
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);
        list.getList();
        list.findById(3);
        list.findByName("obj1");
    }
}
