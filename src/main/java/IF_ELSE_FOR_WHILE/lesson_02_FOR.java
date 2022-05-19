package IF_ELSE_FOR_WHILE;
public class lesson_02_FOR {
    public static void main(String[] args) {

        System.out.println("---------FOR----------------");
        for (int i = 0; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        for (int i = 100; i > 0; i -= 10) {
            System.out.println("Iteration " + i);
            if (i<50) {
                break;
            }
        }

        System.out.println("-------------WHILE-----------");
        int j = 0;
        while (j <= 10) {
            System.out.println("Iteration " + j);
            j += 2;
        }

        int k = 0;
        while (k < 100) {
            k++;
            if (k % 10 != 0) {
                continue;               // бросает прохождение и начинает новый заход
            }
            System.out.println(k + " делится на 10 без остатка");
        }

        System.out.println("-----------DO WHILE-----------");
        int y = 0;
        do {
            System.out.println("Iteration :" + y);
            y ++;
        } while (y < 0);
    }
}
