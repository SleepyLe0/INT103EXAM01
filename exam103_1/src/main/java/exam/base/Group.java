package exam.base;

public class Group<T> {

    private final T[] objects;
    private int size;

    public Group(int capacity) {
        objects = (T[]) new Object[capacity < 2 ? 2 : capacity];
    }

    public int getSize() {
        return size;
    }

    public boolean append(T o) {
        if (o == null || size == objects.length) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (objects[i] == o) {
                return false;
            }
        }
        objects[size++] = o;
        return true;
    }

    public int find(T o) {
        for (int i = 0; i < size; i++) {
            if (objects[i] == o) {
                return i;
            }
        }
        return -1;
    }

    public boolean remove(T o) {
        int x = find(o);
        if (x == -1) {
            return false;
        }
        size--;
        if (x < size) {
            objects[x] = objects[size];
        }
        objects[size] = null;
        return true;
    }

    public T get(int i) {
        if (i > -1 && i < size) {
            return objects[i];
        }
        return null;
    }
}
