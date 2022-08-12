import lesson1.task1.Person;
import lesson1.task1.PersonBuilder;
import lesson2.MyArrayList;
import lesson2.MyLinkedList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Проверка MyArrayList");
        MyArrayList<String> myArrayList = new MyArrayList<>();

        myArrayList.add("A");
        myArrayList.add("B");
        myArrayList.add("C");
        myArrayList.add(0, "D");
        myArrayList.add(2, "E");
        System.out.println(myArrayList );


        myArrayList.remove(0);
        myArrayList.remove("C");
        System.out.println(myArrayList);


        System.out.println("=================");
        System.out.println("Проверка MyLinkedList");

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        System.out.println("Добавляем значение 1:");
        myLinkedList.add("1");
        System.out.println(myLinkedList);
        System.out.println("indexes: " + myLinkedList.getIndexes());
        System.out.println("head: " + myLinkedList.getHead());
        System.out.println("tail: " + myLinkedList.getTail());
        System.out.println("size: " + myLinkedList.size());

        System.out.println("Удаляем значение из позиции 0:");
        myLinkedList.remove(0);
//        System.out.println(myLinkedList);
//        System.out.println("head: " + myLinkedList.getHead());
//        System.out.println("tail: " + myLinkedList.getTail());
//        System.out.println("size: " + myLinkedList.size());

        System.out.println("Добавляем значение 1:");
        myLinkedList.add("1");
        System.out.println(myLinkedList);
        System.out.println("indexes: " + myLinkedList.getIndexes());
        System.out.println("head: " + myLinkedList.getHead());
        System.out.println("tail: " + myLinkedList.getTail());
        System.out.println("size: " + myLinkedList.size());

        System.out.println("Добавляем значение 2:");
        myLinkedList.add("2");
        System.out.println(myLinkedList);
        System.out.println("indexes: " + myLinkedList.getIndexes());
       System.out.println("head: " + myLinkedList.getHead());
        System.out.println("tail: " + myLinkedList.getTail());
        System.out.println("size: " + myLinkedList.size());

        System.out.println("Добавляем значение 3:");
        myLinkedList.add("3");
        System.out.println(myLinkedList);
        System.out.println("indexes: " + myLinkedList.getIndexes());
        System.out.println("head: " + myLinkedList.getHead());
        System.out.println("tail: " + myLinkedList.getTail());
        System.out.println("size: " + myLinkedList.size());

        System.out.println("Добавляем значение 4 в позицию 0:");
        myLinkedList.add(0, "4");
        System.out.println(myLinkedList);
        System.out.println("indexes: " + myLinkedList.getIndexes());
        System.out.println("head: " + myLinkedList.getHead());
        System.out.println("tail: " + myLinkedList.getTail());
        System.out.println("size: " + myLinkedList.size());

        System.out.println("Добавляем значение 5 в позицию 2:");
        myLinkedList.add(2, "5");
        System.out.println(myLinkedList);
        System.out.println("indexes: " + myLinkedList.getIndexes());
        System.out.println("head: " + myLinkedList.getHead());
        System.out.println("tail: " + myLinkedList.getTail());
        System.out.println("size: " + myLinkedList.size());

        System.out.println("Добавляем значение 6 в позицию 3:");
        myLinkedList.add(3, "6");
        System.out.println(myLinkedList);
        System.out.println("indexes: " + myLinkedList.getIndexes());
        System.out.println("head: " + myLinkedList.getHead());
        System.out.println("tail: " + myLinkedList.getTail());
        System.out.println("size: " + myLinkedList.size());

        System.out.println("Удаляем значение из позиции 0:");
        myLinkedList.remove(0);
        System.out.println(myLinkedList);
        System.out.println("indexes: " + myLinkedList.getIndexes());
        System.out.println("head: " + myLinkedList.getHead());
        System.out.println("tail: " + myLinkedList.getTail());
        System.out.println("size: " + myLinkedList.size());

        System.out.println("Удаляем значение 3:");
        myLinkedList.remove("3");
        System.out.println(myLinkedList);
        System.out.println("indexes: " + myLinkedList.getIndexes());
        System.out.println("head: " + myLinkedList.getHead());
        System.out.println("tail: " + myLinkedList.getTail());
        System.out.println("size: " + myLinkedList.size());

        System.out.println("Добавляем значение 7 в позицию 2:");
        myLinkedList.add(2, "7");
        System.out.println(myLinkedList);
        System.out.println("indexes: " + myLinkedList.getIndexes());
        System.out.println("head: " + myLinkedList.getHead());
        System.out.println("tail: " + myLinkedList.getTail());
        System.out.println("size: " + myLinkedList.size());

        System.out.println("Добавляем значение 8 в позицию 1:");
        myLinkedList.add(1, "8");
        System.out.println(myLinkedList);
        System.out.println("indexes: " + myLinkedList.getIndexes());
        System.out.println("head: " + myLinkedList.getHead());
        System.out.println("tail: " + myLinkedList.getTail());
        System.out.println("size: " + myLinkedList.size());

        System.out.println("Удаляем значение из позиции 4:");
        myLinkedList.remove(4);
        System.out.println(myLinkedList);
        System.out.println("indexes: " + myLinkedList.getIndexes());
        System.out.println("head: " + myLinkedList.getHead());
        System.out.println("tail: " + myLinkedList.getTail());
        System.out.println("size: " + myLinkedList.size());

        System.out.println("Добавляем значение 9 в позицию 4:");
        myLinkedList.add(4, "9");
        System.out.println(myLinkedList);
        System.out.println("indexes: " + myLinkedList.getIndexes());
        System.out.println("head: " + myLinkedList.getHead());
        System.out.println("tail: " + myLinkedList.getTail());
        System.out.println("size: " + myLinkedList.size());

        System.out.println("Удаляем значение из позиции 5:");
        myLinkedList.remove(5);
        System.out.println(myLinkedList);
        System.out.println("indexes: " + myLinkedList.getIndexes());
        System.out.println("head: " + myLinkedList.getHead());
        System.out.println("tail: " + myLinkedList.getTail());
        System.out.println("size: " + myLinkedList.size());

        System.out.println("Удаляем значение 9:");
        myLinkedList.remove("9");
        System.out.println(myLinkedList);
        System.out.println("indexes: " + myLinkedList.getIndexes());
        System.out.println("head: " + myLinkedList.getHead());
        System.out.println("tail: " + myLinkedList.getTail());
        System.out.println("size: " + myLinkedList.size());

        System.out.println("Получаем элемент из позиции 0:");
        System.out.println(myLinkedList.get(0));

        System.out.println("Получаем элемент из позиции 3:");
        System.out.println(myLinkedList.get(3));

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