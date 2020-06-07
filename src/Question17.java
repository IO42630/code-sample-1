public class Question17 {


    int average(int[] table) {

        int sum = 0;
        for (int element : table) {
            sum += element;
        }

        return sum / table.length;
    }


    public static void main(String... args) {

        Question17 q = new Question17();

        int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(q.average(values));
    }
}
