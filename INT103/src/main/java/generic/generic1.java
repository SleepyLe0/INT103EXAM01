package generic;

public class generic1<T> {

    private T[] array;
    private int count;

    public generic1(int size) {
        array = (T[]) new Object[size];
        count = 0;
    }

    public boolean add(T element) {
        for (int i = 0; i < count; i++) {
            if (array[i].equals(element)) {
                return false;
            }
        }
        array[count] = element;
        count++;
        return true;
    }

    public boolean remove(T element) {
        for (int i = 0; i < count; i++) {
            if (array[i].equals(element)) {
                for (int j = i; j < count - 1; j++) {
                    array[j] = array[j + 1];
                }
                count--;
                return true;
            }
        }
        return false;
    }

    public T[] getArray() {
        return array;
    }
}
