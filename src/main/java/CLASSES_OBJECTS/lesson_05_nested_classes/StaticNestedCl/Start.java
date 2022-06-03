package CLASSES_OBJECTS.lesson_05_nested_classes.StaticNestedCl;

public class Start {
    public static void main(String[] args) {

        Boeing737 boeing737_1 = new Boeing737(1998);
        Boeing737 boeing737_2 = new Boeing737(2022);

        Boeing737.Drawing drawing_1 = new Boeing737.Drawing();

        System.out.println(boeing737_1.getManufactureYear());

        System.out.println(drawing_1.getPassengersCount());
        System.out.println(drawing_1.getQtyWheels());
    }
}

class Boeing737 {
    private int manufactureYear;
    private static int passengersCount = 300;
    private static int qtyWheels = 2;

    public Boeing737(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public static class Drawing {
        public static int getPassengersCount() {
            return passengersCount;
        }

        public static int getQtyWheels() {
            return qtyWheels;
        }


    }


}
