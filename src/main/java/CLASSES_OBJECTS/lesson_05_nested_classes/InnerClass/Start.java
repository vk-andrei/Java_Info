package CLASSES_OBJECTS.lesson_05_nested_classes.InnerClass;

public class Start {
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle("Merida", 10, 35);
        Bicycle bicycle2 = new Bicycle("Kama", 15, 45);

        Bicycle.HandleBar handleBar1 = bicycle1.new HandleBar();
        Bicycle.Seat seat1 = bicycle1.new Seat();

        bicycle1.start();
        seat1.up();
        seat1.down();
        handleBar1.left();
        handleBar1.right();

        seat1.getSeatParam();

    }
}

class Bicycle {
    private String model;
    private int weight;
    private int seatPostDiameter;

    public Bicycle(String model, int weight, int seatPostDiameter) {
        this.model = model;
        this.weight = weight;
        this.seatPostDiameter = seatPostDiameter;
    }

    public void start() {
        System.out.println("Start!");
    }

    // INNER CLASSES Seat & Handle
    class Seat {
        public void up() {
            System.out.println("Seat is need to up");
        }

        public void down() {
            System.out.println("Seat is need to down");
        }
        public void getSeatParam() {
            System.out.println("Diameter of seat: " + Bicycle.this.seatPostDiameter); // видит переменную внешнего класса
        }

    }

    class HandleBar {
        void right() {
            System.out.println("Turn RIGHT!");
        }

        void left() {
            System.out.println("Turn LEFT!");
        }
    }
}



