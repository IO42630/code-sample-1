public class Question19 {


    boolean isTwin(String a, String b) {

        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] aA = a.toCharArray();
        char[] bA = b.toCharArray();

        for (int i = 0; i < aA.length; i++) {

            for (int j = 0; j < bA.length; j++) {
                if (aA[i] == bA[j]) {
                    aA[i] = '0';
                    bA[j] = '0';
                }
            }
        }

        for (int i = 0; i < aA.length; i++) {
            if (aA[i] != '0') {
                return false;
            }
        }

        return true;

    }


    public static void main(String... args) {
        Question19 q = new Question19();

        System.out.println(q.isTwin("Hello", "world"));
        System.out.println(q.isTwin("acb", "bca"));
        System.out.println(q.isTwin("Lookout", "Outlook"));

    }
}
