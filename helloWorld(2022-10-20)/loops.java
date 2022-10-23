public class loops {
    public static void main(String[] args) {

        // while loop
        int num = 0;
        while (num < 3) {
            System.out.println(num);
            num++;
        }

        int donum = 0;
        do {
            System.out.println("do while");
            donum++;
        } while (donum < 3);

        // for loop
        for (int i = 1; i < 3; i++) {
            System.out.println(i);
        }

        // for-each loop
        String[] numbers = { "'1'", "'2'", "'3'" };
        for (String i : numbers) {
            System.out.println(i);
        }

    }
}
