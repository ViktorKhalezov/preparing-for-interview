package lesson2;


public class MyLinkedList<T> {

    private int size;
    private MyNode head;
    private MyNode tail;



    public T get(int index) {
        if(index > size || index < 0) {
            System.out.println("В метод поступил некорректный индекс. Метод принимает индексы от 0 до " + (size - 1));
            throw new IndexOutOfBoundsException();
        }
        MyNode<T> currentNode = head;
        while(currentNode != null){
            if(currentNode.index == index) {
                return (T) currentNode.value;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean add(T element) {
        MyNode<T> newNode = new MyNode(element);
        if(head == null) {
            head = newNode;
            tail = head;
            newNode.index = 0;
            size++;
            return true;
        }
        tail.next = newNode;
        newNode.previous = tail;
        newNode.index = tail.index + 1;
        tail = newNode;
        size++;
        return true;
    }

    public boolean add(int index, T element) {
        if(index > size || index < 0) {
            System.out.println("В метод поступил некорректный индекс. Метод принимает индексы от 0 до " + size);
            return false;
        }
        MyNode<T> newNode = new MyNode(element);
        MyNode<T> currentNode = head;
        boolean added = false;
        while(currentNode != null) {
            if (index == 0 && added == false) {
                newNode.next = head;
                head.previous = newNode;
                head.index = 1;
                head = newNode;
                newNode.index = 0;
                added = true;
            } else if (index == size && added == false) {
                tail.next = newNode;
                newNode.previous = tail;
                tail = newNode;
                newNode.index = size;
                added = true;
            } else if (currentNode.index == index && added == false) {
                newNode.next = currentNode;
                newNode.previous = currentNode.previous;
                currentNode.previous.next = newNode;
                currentNode.previous = newNode;
                newNode.index = currentNode.index;
                currentNode.index++;
                added = true;
            }

            if (currentNode.index > index && added == true && currentNode != newNode.next) {
                currentNode.index++;
            }
            currentNode = currentNode.next;
        }

        size++;
        return true;
    }


    public boolean remove(T element) {
        if(!contains(element)) {
            System.out.println("Коллекция не содержит поступившего в метод элемента");
            return false;
        }
        MyNode<T> currentNode = head;
        boolean removed = false;
        int removingObjectIndex = 0;
        while(currentNode != null) {
            if(currentNode.value.equals(element) && removed == false) {
                if(head == tail) {
                  head = null;
                  tail = null;
                } else if(currentNode == head && head != tail) {
                    currentNode.next.previous = null;
                    head = currentNode.next;
                    removingObjectIndex = 0;
                } else if(currentNode == tail && head != tail) {
                    currentNode.previous.next = null;
                    tail = currentNode.previous;
                    removingObjectIndex = size - 1;
                } else {
                    currentNode.previous.next = currentNode.next;
                    currentNode.next.previous = currentNode.previous;
                    removingObjectIndex = currentNode.index;
                }
                removed = true;

            }
            if(currentNode.index > removingObjectIndex && removed == true) {
                currentNode.index--;
            }
            currentNode = currentNode.next;
        }
        size--;
        return true;
    }

    public boolean remove(int index) {
        if(index > size - 1 || index < 0) {
            System.out.println("В метод поступил некорректный индекс. Метод принимает индексы от 0 до " + (size - 1));
            return false;
        }
        MyNode<T> currentNode = head;
        boolean removed = false;
        while(currentNode != null) {
            if(currentNode.index == index && removed == false) {
                if(head == tail) {
                    head = null;
                    tail = null;
                } else if(currentNode == head && head != tail) {
                    currentNode.next.previous = null;
                    head = currentNode.next;
                } else if(currentNode == tail && head != tail) {
                    currentNode.previous.next = null;
                    tail = currentNode.previous;
                } else {
                    currentNode.previous.next = currentNode.next;
                    currentNode.next.previous = currentNode.previous;
                }
                removed = true;
            }
            if(currentNode.index > index && removed == true) {
                currentNode.index--;
            }
            currentNode = currentNode.next;
        }
        size--;
        return true;
    }

    public boolean contains(T element) {
        MyNode<T> currentNode = head;
        while(currentNode != null) {
            if(currentNode.value.equals(element)) {
                return true;
            }
            currentNode = currentNode.next;
        }
            return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if(size == 0) {
            return "";
        }
        stringBuilder.append("[");
        MyNode<T> currentNode = head;
        while(currentNode != null) {
            stringBuilder.append(currentNode.value).append(", ");
            currentNode = currentNode.next;
        }
        return stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length()).append("]").toString();
    }

    public T getHead() {
        return (T) head.value;
    }

    public T getTail() {
        return (T) tail.value;
    }

    public String getIndexes() {
        if(size == 0) {
            return "";
        }
        MyNode<T> currentNode = head;
        StringBuilder stringBuilder = new StringBuilder();
        while(currentNode != null) {
            stringBuilder.append(currentNode.index).append(", ");
            currentNode = currentNode.next;
        }
        return stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length()).toString();
    }

    private class MyNode<T> {
        private MyNode next;
        private MyNode previous;
        private int index;
        private T value;

        public MyNode (T value) {
            this.value = value;
        }

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