package STRINGS;

public class lesson_02_StringsFormat {
    public static void main(String[] args) {

        System.out.printf("This is a string, %s", "NICE"); // %s - место куда будет вставлено String
        System.out.println();
        System.out.printf("This is a string, %d", 35); // %d - место куда будет вставлено digit
        System.out.println();
        System.out.printf("This is a string, %f", 35.21); // %f - место куда будет вставлено float
        System.out.println();
        System.out.printf("%s This is %d a string, %f", "NICE", 35, 35.21); // Важен порядок!

        System.out.println("\n--------------------------------------\n");

        System.out.printf("String %10d\n", 532);
        System.out.printf("String %10d\n", 5);
        System.out.printf("String %10d\n", 1234567890);
        System.out.printf("String %10d\n", 532342);

        System.out.println("\n--------------------------------------\n");

        System.out.printf("String %-10d\n", 532);
        System.out.printf("String %-10d\n", 5);
        System.out.printf("String %-10d\n", 1234567890);
        System.out.printf("String %-10d\n", 532342);

        System.out.println("\n--------------------------------------\n");

        System.out.printf("String %.2f\n", 5.23132);
        System.out.printf("String %.2f\n", 345.234234);
        System.out.printf("String %.2f\n", 12345.673);
        System.out.printf("String %.2f\n", 5323.42);


    }
}
