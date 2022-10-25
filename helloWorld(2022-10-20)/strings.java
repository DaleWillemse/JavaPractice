class strings {
    public static void main(String[] args) {
        final String greeting = "hello"; // "final" keyword creates a constant var.

        System.out.println("The length of the string = " + greeting.length());
        System.out.println(greeting.toUpperCase());
        // toLowerCase() also works.

        System.out.println(greeting.indexOf("e"));

        String secondGreeting = "World!";

        System.out.println(greeting.concat(" " + secondGreeting));
    }
}