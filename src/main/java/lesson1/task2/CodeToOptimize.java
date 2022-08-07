package lesson1.task2;


// интерфейсы moveable и stopable, на мой взгляд, не нужны. Все машины вне зависимости от размера и марки движутся, стартуют, останавливаются и открываются.
// В абстрактном классе Car можно не оставлять ни одного абстрактного метода, а сделать методы с реализацией: start(), move(), stop(), open().
// Для машин разных марок и размеров эти методы будут реализовываться одинаково.

public class CodeToOptimize {
    interface Moveable {
        void move();
    }

    interface Stopable {
        void stop();
    }

    abstract class Car {
        public Engine engine; // сделать свойство private
        private String color;
        private String name;

        protected void start() {
            System.out.println("Car starting");
        }

        // метод не был переопределен в классе Lorry
        abstract void open();

        public Engine getEngine() {
            return engine;
        }

        public void setEngine(Engine engine) {
            this.engine = engine;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    class LightWeightCar extends Car implements Moveable {
        @Override
        void open() {
            System.out.println("Car is open");
        }

        @Override
        public void move() {
            System.out.println("Car is moving");
        }
    }

    class Lorry extends Car implements Moveable, Stopable { // интерфейсы Moveable и Stopable должны быть не унаследованы, а реализованы (implements)
        public void move() {
            System.out.println("Car is moving");
        }

        public void stop() {
            System.out.println("Car is stop");
        }

        @Override
        void open() {

        }
    }

    public class Engine {

    }
}
