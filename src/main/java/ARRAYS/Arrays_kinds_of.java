package ARRAYS;
public class Arrays_kinds_of {

    public static void main(String[] args) {

        // --------------- МАССИВЫ
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = i * 10;
        }

        nums[3] = 300;

        // ---------------- перебирает каждый элемент массива (for each)
        for (int e : nums) {
            System.out.println("ITEM  = " + e);
        }

        // ---------------- обычный перебор
        for (int i = 0; i < 5; i++) {
            System.out.println("ITEM [" + i + "] = " + nums[i]);
        }

        // ---------------- многомерный массив
        int[][] table = new int[3][];
        table[0] = new int[4];
        table[1] = new int[4];
        table[2] = new int[40];
    }
}