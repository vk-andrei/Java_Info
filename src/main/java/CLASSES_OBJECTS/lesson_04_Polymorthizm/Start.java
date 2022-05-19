package CLASSES_OBJECTS.lesson_04_Polymorthizm;

public class Start {
    public static void main(String[] args) {

        Shape form = new Shape();
        form.draw();                    //  НИЧЕГО НЕ СДЕЛАЕТ


        Circle num1 = new Circle();
        //Shape num1 = new Circle();    // МОЖНО И ТАК!!!!!!!
        Square num2 = new Square();
        Triangle num3 = new Triangle();

        num1.draw();
        num2.draw();
        num3.draw();
        System.out.println("---------------------------");

        // АЛЬТЕРНАТИВНЫЙ СПОСОБ ВЫВОДА

        Shape [] arrShape = new Shape[] {new Circle(), new Square(), new Triangle()};

        for (Shape elem : arrShape) {
            elem.draw();
        }
    }
}