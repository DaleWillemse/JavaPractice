class ifELse {
    public static void main(String[] args) {
        int count = 0;

        if (count == 0) {
            System.out.println("Count = 0");
        } else if (count != 0) {
            System.out.println("Count != 0");
        } else {
            System.out.println("Count isn't a number");
        }

        // Short hand if and else
        String answer = (count == 1) ? "Count = 1" : "Count != 1";
        System.out.println(answer);
    }

}
