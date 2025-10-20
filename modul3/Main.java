package pdpuz;


class SimpleArrayList<T> {
    private Object[] elements;
    private int size = 0;

    public SimpleArrayList() {
        elements = new Object[10];
    }


    public void add(T element) {
        if (size == elements.length) {
            grow();
        }
        elements[size++] = element;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        checkIndex(index);
        return (T) elements[index];
    }

    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null;
    }


    public int size() {
        return size;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void grow() {
        Object[] newArr = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArr, 0, elements.length);
        elements = newArr;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        SimpleArrayList<String> list = new SimpleArrayList<>();


        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("List: " + list);


        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Size: " + list.size()); // 3
        list.remove(1);
        System.out.println("After remove index 1: " + list);
        System.out.println("Is list empty? " + list.isEmpty());
        list.clear();
        System.out.println("After clear: " + list);
        System.out.println("Is list empty now? " + list.isEmpty());
    }
}
