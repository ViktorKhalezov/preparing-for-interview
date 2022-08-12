package lesson2;



public class MyArrayList<T> {

    private T[] array;
    private int capacity;
    private int size;

    public MyArrayList() {
        this.capacity = 10;
        array = (T[]) new Object[capacity];
    }


    public T get(int index) {
        if(index > size - 1 || index < 0) {
            System.out.println("В метод поступил некорректный индекс. Метод принимает индексы от 0 до " + (size - 1));
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public int size() {
        return size;
    }

    public boolean add(T element) {
        if(size + 1 == array.length) {
            increaseSize();
        }
        array[size++] = element;
        return true;
    }

    public boolean add(int index, T element) {
        if(index > size || index < 0) {
            System.out.println("В метод поступил некорректный индекс. Метод принимает индексы от 0 до " + size);
            return false;
        }
        if(size + 1 == array.length) {
            increaseSize();
        }
        T[] newArray = (T[]) new Object[capacity];
        for(int i = 0; i <= size; i++) {
            if(i < index) {
                newArray[i] = array[i];
            }
            if(i == index) {
                newArray[i] = element;
            }
            if (i > index) {
                newArray[i] = array[i - 1];
            }
        }
        size++;
        array = newArray;
        return true;
    }

    public boolean remove(T element) {
        if(!contains(element)) {
            System.out.println("Коллекция не содержит поступившего в метод элемента");
            return false;
        }
        T[] newArray = (T[]) new Object[capacity];
        int removingElementIndex = 0;
        for(int i = 0; i < size; i++) {
            if(array[i].equals(element)) {
              removingElementIndex = i;
            }
        }
        for(int i = 0; i < size - 1; i++) {
            if(i < removingElementIndex) {
                newArray[i] = array[i];
            }
            if(i >= removingElementIndex) {
                newArray[i] = array[i + 1];
            }
        }
        size--;
        array = newArray;
        return true;
    }

    public boolean remove(int index) {
        if(index > size - 1 || index < 0) {
            System.out.println("В метод поступил некорректный индекс. Метод принимает индексы от 0 до " + (size - 1));
            return false;
        }
        T[] newArray = (T[]) new Object[capacity];
        for(int i = 0; i < size - 1; i++) {
            if(i < index) {
                newArray[i] = array[i];
            }
            if(i >= index) {
                newArray[i] = array[i + 1];
            }
        }
        size--;
        array = newArray;
        return true;
    }


    public boolean contains(T element) {
        for(int i = 0; i < size; i++) {
            if(array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    private void increaseSize() {
        capacity = (int) (capacity * 1.5);
        T[] newArray = (T[]) new Object[capacity];
        for(int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if(size == 0) {
            return "";
        }
        stringBuilder.append("[");

        for(int i = 0; i < size; i++){
            stringBuilder.append(array[i]).append(", ");
        }
        return stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length()).append("]").toString();
    }

}

// Методы:
// T get(int index);
// int size();
// boolean add(T element);
// void add(int index, T element);
// boolean remove(T element);
// boolean T remove(int index);
// boolean contains(T element);