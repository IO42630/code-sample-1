public class Question16 {


    int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }


    public static void main(String... args) {

        Question16 q = new Question16();

        System.out.println(q.factorial(5));
        System.out.println(q.factorial(4));
    }
}
