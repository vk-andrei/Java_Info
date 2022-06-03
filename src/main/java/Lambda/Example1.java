package Lambda;

public class Example1 {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;

        // ������������� ���������� ������

        IntSum myIntSum1 = new IntSum() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };

        // ������������� ������

        IntSum myIntSum2 = (a, b) -> a + b;

        System.out.println(myIntSum1.sum(x, y));
        System.out.println(myIntSum2.sum(x, y));

    }


    public interface IntSum {
        int sum(int a, int b);
    }


}